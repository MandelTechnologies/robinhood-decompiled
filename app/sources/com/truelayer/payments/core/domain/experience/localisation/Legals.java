package com.truelayer.payments.core.domain.experience.localisation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Legals.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "", "text", "", "howItWorks", "(Ljava/lang/String;Ljava/lang/String;)V", "getHowItWorks", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Legals {
    private final String howItWorks;
    private final String text;

    public static /* synthetic */ Legals copy$default(Legals legals, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legals.text;
        }
        if ((i & 2) != 0) {
            str2 = legals.howItWorks;
        }
        return legals.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHowItWorks() {
        return this.howItWorks;
    }

    public final Legals copy(String text, String howItWorks) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new Legals(text, howItWorks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Legals)) {
            return false;
        }
        Legals legals = (Legals) other;
        return Intrinsics.areEqual(this.text, legals.text) && Intrinsics.areEqual(this.howItWorks, legals.howItWorks);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.howItWorks;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Legals(text=" + this.text + ", howItWorks=" + this.howItWorks + ")";
    }

    public Legals(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.howItWorks = str;
    }

    public final String getText() {
        return this.text;
    }

    public final String getHowItWorks() {
        return this.howItWorks;
    }
}
