package com.robinhood.android.advisory.portfolio.update.results;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: ModelPortfolioChangeRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/results/ModelPortfolioChangeRow;", "", AnnotatedPrivateKey.LABEL, "", "originalValue", "newValue", "description", "valueColor", "Lrh_server_driven_ui/v1/ThemedColorDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;)V", "getLabel", "()Ljava/lang/String;", "getOriginalValue", "getNewValue", "getDescription", "getValueColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ModelPortfolioChangeRow {
    public static final int $stable = 8;
    private final String description;
    private final String label;
    private final String newValue;
    private final String originalValue;
    private final ThemedColorDto valueColor;

    public static /* synthetic */ ModelPortfolioChangeRow copy$default(ModelPortfolioChangeRow modelPortfolioChangeRow, String str, String str2, String str3, String str4, ThemedColorDto themedColorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelPortfolioChangeRow.label;
        }
        if ((i & 2) != 0) {
            str2 = modelPortfolioChangeRow.originalValue;
        }
        if ((i & 4) != 0) {
            str3 = modelPortfolioChangeRow.newValue;
        }
        if ((i & 8) != 0) {
            str4 = modelPortfolioChangeRow.description;
        }
        if ((i & 16) != 0) {
            themedColorDto = modelPortfolioChangeRow.valueColor;
        }
        ThemedColorDto themedColorDto2 = themedColorDto;
        String str5 = str3;
        return modelPortfolioChangeRow.copy(str, str2, str5, str4, themedColorDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginalValue() {
        return this.originalValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNewValue() {
        return this.newValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final ThemedColorDto getValueColor() {
        return this.valueColor;
    }

    public final ModelPortfolioChangeRow copy(String label, String originalValue, String newValue, String description, ThemedColorDto valueColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ModelPortfolioChangeRow(label, originalValue, newValue, description, valueColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelPortfolioChangeRow)) {
            return false;
        }
        ModelPortfolioChangeRow modelPortfolioChangeRow = (ModelPortfolioChangeRow) other;
        return Intrinsics.areEqual(this.label, modelPortfolioChangeRow.label) && Intrinsics.areEqual(this.originalValue, modelPortfolioChangeRow.originalValue) && Intrinsics.areEqual(this.newValue, modelPortfolioChangeRow.newValue) && Intrinsics.areEqual(this.description, modelPortfolioChangeRow.description) && Intrinsics.areEqual(this.valueColor, modelPortfolioChangeRow.valueColor);
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.originalValue;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.newValue.hashCode()) * 31) + this.description.hashCode()) * 31;
        ThemedColorDto themedColorDto = this.valueColor;
        return iHashCode2 + (themedColorDto != null ? themedColorDto.hashCode() : 0);
    }

    public String toString() {
        return "ModelPortfolioChangeRow(label=" + this.label + ", originalValue=" + this.originalValue + ", newValue=" + this.newValue + ", description=" + this.description + ", valueColor=" + this.valueColor + ")";
    }

    public ModelPortfolioChangeRow(String label, String str, String newValue, String description, ThemedColorDto themedColorDto) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(description, "description");
        this.label = label;
        this.originalValue = str;
        this.newValue = newValue;
        this.description = description;
        this.valueColor = themedColorDto;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }

    public final String getNewValue() {
        return this.newValue;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ThemedColorDto getValueColor() {
        return this.valueColor;
    }
}
