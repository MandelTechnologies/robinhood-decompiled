package com.robinhood.android.creditcard.p091ui.creditapplication.goldagreement;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Node;

/* compiled from: GoldAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/goldagreement/GoldAgreementViewState;", "", "disclosureTitle", "", "disclosureMarkdown", "Lorg/commonmark/node/Node;", "error", "", "<init>", "(Ljava/lang/String;Lorg/commonmark/node/Node;Ljava/lang/Throwable;)V", "getDisclosureTitle", "()Ljava/lang/String;", "getDisclosureMarkdown", "()Lorg/commonmark/node/Node;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GoldAgreementViewState {
    public static final int $stable = 8;
    private final Node disclosureMarkdown;
    private final String disclosureTitle;
    private final Throwable error;

    public static /* synthetic */ GoldAgreementViewState copy$default(GoldAgreementViewState goldAgreementViewState, String str, Node node, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldAgreementViewState.disclosureTitle;
        }
        if ((i & 2) != 0) {
            node = goldAgreementViewState.disclosureMarkdown;
        }
        if ((i & 4) != 0) {
            th = goldAgreementViewState.error;
        }
        return goldAgreementViewState.copy(str, node, th);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisclosureTitle() {
        return this.disclosureTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final Node getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final GoldAgreementViewState copy(String disclosureTitle, Node disclosureMarkdown, Throwable error) {
        return new GoldAgreementViewState(disclosureTitle, disclosureMarkdown, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldAgreementViewState)) {
            return false;
        }
        GoldAgreementViewState goldAgreementViewState = (GoldAgreementViewState) other;
        return Intrinsics.areEqual(this.disclosureTitle, goldAgreementViewState.disclosureTitle) && Intrinsics.areEqual(this.disclosureMarkdown, goldAgreementViewState.disclosureMarkdown) && Intrinsics.areEqual(this.error, goldAgreementViewState.error);
    }

    public int hashCode() {
        String str = this.disclosureTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Node node = this.disclosureMarkdown;
        int iHashCode2 = (iHashCode + (node == null ? 0 : node.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "GoldAgreementViewState(disclosureTitle=" + this.disclosureTitle + ", disclosureMarkdown=" + this.disclosureMarkdown + ", error=" + this.error + ")";
    }

    public GoldAgreementViewState(String str, Node node, Throwable th) {
        this.disclosureTitle = str;
        this.disclosureMarkdown = node;
        this.error = th;
    }

    public final String getDisclosureTitle() {
        return this.disclosureTitle;
    }

    public final Node getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final Throwable getError() {
        return this.error;
    }
}
