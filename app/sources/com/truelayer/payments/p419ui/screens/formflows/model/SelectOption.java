package com.truelayer.payments.p419ui.screens.formflows.model;

import com.robinhood.android.markdown.compose.MarkdownText4;
import com.truelayer.payments.p419ui.utils.StringExtensions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SelectOption.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/formflows/model/SelectOption;", "", "id", "", AnnotatedPrivateKey.LABEL, MarkdownText4.TagImageUrl, "extendedImageUrl", "normalizedLabel", "normalizedSearchAliases", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getExtendedImageUrl", "()Ljava/lang/String;", "getId", "getImageUrl", "getLabel", "getNormalizedLabel", "setNormalizedLabel", "(Ljava/lang/String;)V", "getNormalizedSearchAliases", "()Ljava/util/List;", "setNormalizedSearchAliases", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SelectOption {
    public static final int $stable = 8;
    private final String extendedImageUrl;
    private final String id;
    private final String imageUrl;
    private final String label;
    private String normalizedLabel;
    private List<String> normalizedSearchAliases;

    public static /* synthetic */ SelectOption copy$default(SelectOption selectOption, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectOption.id;
        }
        if ((i & 2) != 0) {
            str2 = selectOption.label;
        }
        if ((i & 4) != 0) {
            str3 = selectOption.imageUrl;
        }
        if ((i & 8) != 0) {
            str4 = selectOption.extendedImageUrl;
        }
        if ((i & 16) != 0) {
            str5 = selectOption.normalizedLabel;
        }
        if ((i & 32) != 0) {
            list = selectOption.normalizedSearchAliases;
        }
        String str6 = str5;
        List list2 = list;
        return selectOption.copy(str, str2, str3, str4, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExtendedImageUrl() {
        return this.extendedImageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNormalizedLabel() {
        return this.normalizedLabel;
    }

    public final List<String> component6() {
        return this.normalizedSearchAliases;
    }

    public final SelectOption copy(String id, String label, String imageUrl, String extendedImageUrl, String normalizedLabel, List<String> normalizedSearchAliases) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(normalizedLabel, "normalizedLabel");
        Intrinsics.checkNotNullParameter(normalizedSearchAliases, "normalizedSearchAliases");
        return new SelectOption(id, label, imageUrl, extendedImageUrl, normalizedLabel, normalizedSearchAliases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectOption)) {
            return false;
        }
        SelectOption selectOption = (SelectOption) other;
        return Intrinsics.areEqual(this.id, selectOption.id) && Intrinsics.areEqual(this.label, selectOption.label) && Intrinsics.areEqual(this.imageUrl, selectOption.imageUrl) && Intrinsics.areEqual(this.extendedImageUrl, selectOption.extendedImageUrl) && Intrinsics.areEqual(this.normalizedLabel, selectOption.normalizedLabel) && Intrinsics.areEqual(this.normalizedSearchAliases, selectOption.normalizedSearchAliases);
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.label.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.extendedImageUrl;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.normalizedLabel.hashCode()) * 31) + this.normalizedSearchAliases.hashCode();
    }

    public String toString() {
        return "SelectOption(id=" + this.id + ", label=" + this.label + ", imageUrl=" + this.imageUrl + ", extendedImageUrl=" + this.extendedImageUrl + ", normalizedLabel=" + this.normalizedLabel + ", normalizedSearchAliases=" + this.normalizedSearchAliases + ")";
    }

    public SelectOption(String id, String label, String str, String str2, String normalizedLabel, List<String> normalizedSearchAliases) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(normalizedLabel, "normalizedLabel");
        Intrinsics.checkNotNullParameter(normalizedSearchAliases, "normalizedSearchAliases");
        this.id = id;
        this.label = label;
        this.imageUrl = str;
        this.extendedImageUrl = str2;
        this.normalizedLabel = normalizedLabel;
        this.normalizedSearchAliases = normalizedSearchAliases;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getExtendedImageUrl() {
        return this.extendedImageUrl;
    }

    public /* synthetic */ SelectOption(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? StringExtensions.searchNormalizeLowercase(str2) : str5, list);
    }

    public final String getNormalizedLabel() {
        return this.normalizedLabel;
    }

    public final void setNormalizedLabel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.normalizedLabel = str;
    }

    public final List<String> getNormalizedSearchAliases() {
        return this.normalizedSearchAliases;
    }

    public final void setNormalizedSearchAliases(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.normalizedSearchAliases = list;
    }
}
