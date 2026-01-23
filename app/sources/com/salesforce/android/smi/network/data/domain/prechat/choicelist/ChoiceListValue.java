package com.salesforce.android.smi.network.data.domain.prechat.choicelist;

import com.robinhood.models.card.p311db.Card;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ChoiceListValue.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/prechat/choicelist/ChoiceListValue;", "", Card.Icon.ORDER, "", "choiceListValueName", "", "choiceListValueId", "isDefaultValue", "", AnnotatedPrivateKey.LABEL, "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getOrder", "()I", "getChoiceListValueName", "()Ljava/lang/String;", "getChoiceListValueId", "()Z", "getLabel", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChoiceListValue {
    private final String choiceListValueId;
    private final String choiceListValueName;
    private final boolean isDefaultValue;
    private final String label;
    private final int order;

    public static /* synthetic */ ChoiceListValue copy$default(ChoiceListValue choiceListValue, int i, String str, String str2, boolean z, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = choiceListValue.order;
        }
        if ((i2 & 2) != 0) {
            str = choiceListValue.choiceListValueName;
        }
        if ((i2 & 4) != 0) {
            str2 = choiceListValue.choiceListValueId;
        }
        if ((i2 & 8) != 0) {
            z = choiceListValue.isDefaultValue;
        }
        if ((i2 & 16) != 0) {
            str3 = choiceListValue.label;
        }
        String str4 = str3;
        String str5 = str2;
        return choiceListValue.copy(i, str, str5, z, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChoiceListValueName() {
        return this.choiceListValueName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChoiceListValueId() {
        return this.choiceListValueId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefaultValue() {
        return this.isDefaultValue;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final ChoiceListValue copy(int order, String choiceListValueName, String choiceListValueId, boolean isDefaultValue, String label) {
        Intrinsics.checkNotNullParameter(choiceListValueName, "choiceListValueName");
        Intrinsics.checkNotNullParameter(choiceListValueId, "choiceListValueId");
        Intrinsics.checkNotNullParameter(label, "label");
        return new ChoiceListValue(order, choiceListValueName, choiceListValueId, isDefaultValue, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChoiceListValue)) {
            return false;
        }
        ChoiceListValue choiceListValue = (ChoiceListValue) other;
        return this.order == choiceListValue.order && Intrinsics.areEqual(this.choiceListValueName, choiceListValue.choiceListValueName) && Intrinsics.areEqual(this.choiceListValueId, choiceListValue.choiceListValueId) && this.isDefaultValue == choiceListValue.isDefaultValue && Intrinsics.areEqual(this.label, choiceListValue.label);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.order) * 31) + this.choiceListValueName.hashCode()) * 31) + this.choiceListValueId.hashCode()) * 31) + Boolean.hashCode(this.isDefaultValue)) * 31) + this.label.hashCode();
    }

    public ChoiceListValue(int i, String choiceListValueName, String choiceListValueId, boolean z, String label) {
        Intrinsics.checkNotNullParameter(choiceListValueName, "choiceListValueName");
        Intrinsics.checkNotNullParameter(choiceListValueId, "choiceListValueId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.order = i;
        this.choiceListValueName = choiceListValueName;
        this.choiceListValueId = choiceListValueId;
        this.isDefaultValue = z;
        this.label = label;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getChoiceListValueName() {
        return this.choiceListValueName;
    }

    public final String getChoiceListValueId() {
        return this.choiceListValueId;
    }

    public final boolean isDefaultValue() {
        return this.isDefaultValue;
    }

    public final String getLabel() {
        return this.label;
    }

    public String toString() {
        return this.label;
    }
}
