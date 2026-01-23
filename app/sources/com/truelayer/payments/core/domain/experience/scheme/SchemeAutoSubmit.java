package com.truelayer.payments.core.domain.experience.scheme;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SchemeSelection.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/scheme/SchemeAutoSubmit;", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "autoSubmitSchemeId", "", "(Ljava/lang/String;)V", "getAutoSubmitSchemeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SchemeAutoSubmit implements SchemeSelection {
    private final String autoSubmitSchemeId;

    public static /* synthetic */ SchemeAutoSubmit copy$default(SchemeAutoSubmit schemeAutoSubmit, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemeAutoSubmit.autoSubmitSchemeId;
        }
        return schemeAutoSubmit.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAutoSubmitSchemeId() {
        return this.autoSubmitSchemeId;
    }

    public final SchemeAutoSubmit copy(String autoSubmitSchemeId) {
        Intrinsics.checkNotNullParameter(autoSubmitSchemeId, "autoSubmitSchemeId");
        return new SchemeAutoSubmit(autoSubmitSchemeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SchemeAutoSubmit) && Intrinsics.areEqual(this.autoSubmitSchemeId, ((SchemeAutoSubmit) other).autoSubmitSchemeId);
    }

    public int hashCode() {
        return this.autoSubmitSchemeId.hashCode();
    }

    public String toString() {
        return "SchemeAutoSubmit(autoSubmitSchemeId=" + this.autoSubmitSchemeId + ")";
    }

    public SchemeAutoSubmit(String autoSubmitSchemeId) {
        Intrinsics.checkNotNullParameter(autoSubmitSchemeId, "autoSubmitSchemeId");
        this.autoSubmitSchemeId = autoSubmitSchemeId;
    }

    public final String getAutoSubmitSchemeId() {
        return this.autoSubmitSchemeId;
    }
}
