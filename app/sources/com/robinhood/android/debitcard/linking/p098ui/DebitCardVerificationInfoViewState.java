package com.robinhood.android.debitcard.linking.p098ui;

import android.text.Spanned;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationInfoContent;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardVerificationInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoViewState;", "", "content", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent;", "<init>", "(Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent;)V", "isLoadingViewVisible", "", "()Z", "isContentVisible", "titleVisibilityText", "", "getTitleVisibilityText", "()Ljava/lang/String;", "rows", "", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoContent$Row;", "getRows", "()Ljava/util/List;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Landroid/text/Spanned;", "getDisclosure", "()Landroid/text/Spanned;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DebitCardVerificationInfoViewState {
    public static final int $stable = 8;
    private final DebitCardVerificationInfoContent content;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitCardVerificationInfoViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final DebitCardVerificationInfoContent getContent() {
        return this.content;
    }

    public static /* synthetic */ DebitCardVerificationInfoViewState copy$default(DebitCardVerificationInfoViewState debitCardVerificationInfoViewState, DebitCardVerificationInfoContent debitCardVerificationInfoContent, int i, Object obj) {
        if ((i & 1) != 0) {
            debitCardVerificationInfoContent = debitCardVerificationInfoViewState.content;
        }
        return debitCardVerificationInfoViewState.copy(debitCardVerificationInfoContent);
    }

    public final DebitCardVerificationInfoViewState copy(DebitCardVerificationInfoContent content) {
        return new DebitCardVerificationInfoViewState(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DebitCardVerificationInfoViewState) && Intrinsics.areEqual(this.content, ((DebitCardVerificationInfoViewState) other).content);
    }

    public int hashCode() {
        DebitCardVerificationInfoContent debitCardVerificationInfoContent = this.content;
        if (debitCardVerificationInfoContent == null) {
            return 0;
        }
        return debitCardVerificationInfoContent.hashCode();
    }

    public String toString() {
        return "DebitCardVerificationInfoViewState(content=" + this.content + ")";
    }

    public DebitCardVerificationInfoViewState(DebitCardVerificationInfoContent debitCardVerificationInfoContent) {
        this.content = debitCardVerificationInfoContent;
    }

    public /* synthetic */ DebitCardVerificationInfoViewState(DebitCardVerificationInfoContent debitCardVerificationInfoContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : debitCardVerificationInfoContent);
    }

    public final boolean isLoadingViewVisible() {
        return this.content == null;
    }

    public final boolean isContentVisible() {
        return this.content != null;
    }

    public final String getTitleVisibilityText() {
        DebitCardVerificationInfoContent debitCardVerificationInfoContent = this.content;
        if (debitCardVerificationInfoContent != null) {
            return debitCardVerificationInfoContent.getTitle();
        }
        return null;
    }

    public final List<DebitCardVerificationInfoContent.Row> getRows() {
        DebitCardVerificationInfoContent debitCardVerificationInfoContent = this.content;
        if (debitCardVerificationInfoContent != null) {
            return debitCardVerificationInfoContent.getRows();
        }
        return null;
    }

    public final Spanned getDisclosure() {
        DebitCardVerificationInfoContent debitCardVerificationInfoContent = this.content;
        if (debitCardVerificationInfoContent != null) {
            return debitCardVerificationInfoContent.getDisclosure();
        }
        return null;
    }
}
