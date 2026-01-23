package com.robinhood.android.options.comboorders.detail.components.infogrid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ComboOrderDetailInfoGridViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/DefaultGridItem;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailGridItemViewState;", "type", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/DefaultGridItemType;", AnnotatedPrivateKey.LABEL, "", "value", "<init>", "(Lcom/robinhood/android/options/comboorders/detail/components/infogrid/DefaultGridItemType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/options/comboorders/detail/components/infogrid/DefaultGridItemType;", "getLabel", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DefaultGridItem extends ComboOrderDetailInfoGridViewState2 {
    public static final int $stable = 0;
    private final String label;
    private final ComboOrderDetailInfoGridViewState4 type;
    private final String value;

    public static /* synthetic */ DefaultGridItem copy$default(DefaultGridItem defaultGridItem, ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState4, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            comboOrderDetailInfoGridViewState4 = defaultGridItem.type;
        }
        if ((i & 2) != 0) {
            str = defaultGridItem.label;
        }
        if ((i & 4) != 0) {
            str2 = defaultGridItem.value;
        }
        return defaultGridItem.copy(comboOrderDetailInfoGridViewState4, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ComboOrderDetailInfoGridViewState4 getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final DefaultGridItem copy(ComboOrderDetailInfoGridViewState4 type2, String label, String value) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new DefaultGridItem(type2, label, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultGridItem)) {
            return false;
        }
        DefaultGridItem defaultGridItem = (DefaultGridItem) other;
        return this.type == defaultGridItem.type && Intrinsics.areEqual(this.label, defaultGridItem.label) && Intrinsics.areEqual(this.value, defaultGridItem.value);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "DefaultGridItem(type=" + this.type + ", label=" + this.label + ", value=" + this.value + ")";
    }

    public final ComboOrderDetailInfoGridViewState4 getType() {
        return this.type;
    }

    @Override // com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridViewState2
    public String getLabel() {
        return this.label;
    }

    @Override // com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridViewState2
    public String getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGridItem(ComboOrderDetailInfoGridViewState4 type2, String label, String value) {
        super(label, value, null);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = type2;
        this.label = label;
        this.value = value;
    }
}
