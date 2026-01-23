package com.truelayer.payments.core.domain.experience.scheme;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SchemeSelection.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelectionSelect;", "Lcom/truelayer/payments/core/domain/experience/scheme/SchemeSelection;", "subtitle", "", "schemes", "", "Lcom/truelayer/payments/core/domain/experience/scheme/Scheme;", "autoSelectedSchemeId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAutoSelectedSchemeId", "()Ljava/lang/String;", "getSchemes", "()Ljava/util/List;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SchemeSelectionSelect implements SchemeSelection {
    private final String autoSelectedSchemeId;
    private final List<Scheme> schemes;
    private final String subtitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemeSelectionSelect copy$default(SchemeSelectionSelect schemeSelectionSelect, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemeSelectionSelect.subtitle;
        }
        if ((i & 2) != 0) {
            list = schemeSelectionSelect.schemes;
        }
        if ((i & 4) != 0) {
            str2 = schemeSelectionSelect.autoSelectedSchemeId;
        }
        return schemeSelectionSelect.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Scheme> component2() {
        return this.schemes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutoSelectedSchemeId() {
        return this.autoSelectedSchemeId;
    }

    public final SchemeSelectionSelect copy(String subtitle, List<Scheme> schemes, String autoSelectedSchemeId) {
        return new SchemeSelectionSelect(subtitle, schemes, autoSelectedSchemeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchemeSelectionSelect)) {
            return false;
        }
        SchemeSelectionSelect schemeSelectionSelect = (SchemeSelectionSelect) other;
        return Intrinsics.areEqual(this.subtitle, schemeSelectionSelect.subtitle) && Intrinsics.areEqual(this.schemes, schemeSelectionSelect.schemes) && Intrinsics.areEqual(this.autoSelectedSchemeId, schemeSelectionSelect.autoSelectedSchemeId);
    }

    public int hashCode() {
        String str = this.subtitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Scheme> list = this.schemes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.autoSelectedSchemeId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SchemeSelectionSelect(subtitle=" + this.subtitle + ", schemes=" + this.schemes + ", autoSelectedSchemeId=" + this.autoSelectedSchemeId + ")";
    }

    public SchemeSelectionSelect(String str, List<Scheme> list, String str2) {
        this.subtitle = str;
        this.schemes = list;
        this.autoSelectedSchemeId = str2;
    }

    public /* synthetic */ SchemeSelectionSelect(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, str2);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<Scheme> getSchemes() {
        return this.schemes;
    }

    public final String getAutoSelectedSchemeId() {
        return this.autoSelectedSchemeId;
    }
}
