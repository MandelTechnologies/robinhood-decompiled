package com.robinhood.android.debitcard.linking.p098ui;

import android.text.Spanned;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardVerificationInfoContent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent;", "", "title", "", "rows", "", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent$Row;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Landroid/text/Spanned;", "<init>", "(Ljava/lang/String;Ljava/util/List;Landroid/text/Spanned;)V", "getTitle", "()Ljava/lang/String;", "getRows", "()Ljava/util/List;", "getDisclosure", "()Landroid/text/Spanned;", "Row", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardVerificationInfoContent {
    public static final int $stable = 8;
    private final Spanned disclosure;
    private final List<Row> rows;
    private final String title;

    public DebitCardVerificationInfoContent(String str, List<Row> rows, Spanned spanned) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.title = str;
        this.rows = rows;
        this.disclosure = spanned;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Row> getRows() {
        return this.rows;
    }

    public final Spanned getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: DebitCardVerificationInfoContent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent$Row;", "", "pogNumber", "", "primaryText", "", "secondaryText", "Landroid/text/Spanned;", "<init>", "(ILjava/lang/String;Landroid/text/Spanned;)V", "getPogNumber", "()I", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "()Landroid/text/Spanned;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = 8;
        private final int pogNumber;
        private final String primaryText;
        private final Spanned secondaryText;

        public static /* synthetic */ Row copy$default(Row row, int i, String str, Spanned spanned, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = row.pogNumber;
            }
            if ((i2 & 2) != 0) {
                str = row.primaryText;
            }
            if ((i2 & 4) != 0) {
                spanned = row.secondaryText;
            }
            return row.copy(i, str, spanned);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPogNumber() {
            return this.pogNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final Spanned getSecondaryText() {
            return this.secondaryText;
        }

        public final Row copy(int pogNumber, String primaryText, Spanned secondaryText) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new Row(pogNumber, primaryText, secondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return this.pogNumber == row.pogNumber && Intrinsics.areEqual(this.primaryText, row.primaryText) && Intrinsics.areEqual(this.secondaryText, row.secondaryText);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.pogNumber) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode();
        }

        public String toString() {
            return "Row(pogNumber=" + this.pogNumber + ", primaryText=" + this.primaryText + ", secondaryText=" + ((Object) this.secondaryText) + ")";
        }

        public Row(int i, String primaryText, Spanned secondaryText) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.pogNumber = i;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
        }

        public final int getPogNumber() {
            return this.pogNumber;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final Spanned getSecondaryText() {
            return this.secondaryText;
        }
    }
}
