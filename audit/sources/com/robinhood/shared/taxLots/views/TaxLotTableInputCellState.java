package com.robinhood.shared.taxLots.views;

import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotTableInputCell.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010)\u001a\u00020\nHÆ\u0003Jf\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00061"}, m3636d2 = {"Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;", "T", "", "id", "", "value", "placeholderText", "toggleableState", "Landroidx/compose/ui/state/ToggleableState;", "enabled", "", "isError", "tapAction", "isFocused", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;ZZLjava/lang/Object;Z)V", "getId", "()Ljava/lang/String;", "getValue", "getPlaceholderText", "getToggleableState", "()Landroidx/compose/ui/state/ToggleableState;", "getEnabled", "()Z", "getTapAction", "()Ljava/lang/Object;", "Ljava/lang/Object;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "placeholderTextFieldValue", "getPlaceholderTextFieldValue", "isEmpty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;ZZLjava/lang/Object;Z)Lcom/robinhood/shared/taxLots/views/TaxLotTableInputCellState;", "equals", "other", "hashCode", "", "toString", "lib-lot-table-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TaxLotTableInputCellState<T> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String id;
    private final boolean isEmpty;
    private final boolean isError;
    private final boolean isFocused;
    private final String placeholderText;
    private final T tapAction;
    private final ToggleableState toggleableState;
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxLotTableInputCellState copy$default(TaxLotTableInputCellState taxLotTableInputCellState, String str, String str2, String str3, ToggleableState toggleableState, boolean z, boolean z2, Object obj, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = taxLotTableInputCellState.id;
        }
        if ((i & 2) != 0) {
            str2 = taxLotTableInputCellState.value;
        }
        if ((i & 4) != 0) {
            str3 = taxLotTableInputCellState.placeholderText;
        }
        if ((i & 8) != 0) {
            toggleableState = taxLotTableInputCellState.toggleableState;
        }
        if ((i & 16) != 0) {
            z = taxLotTableInputCellState.enabled;
        }
        if ((i & 32) != 0) {
            z2 = taxLotTableInputCellState.isError;
        }
        T t = obj;
        if ((i & 64) != 0) {
            t = taxLotTableInputCellState.tapAction;
        }
        if ((i & 128) != 0) {
            z3 = taxLotTableInputCellState.isFocused;
        }
        T t2 = t;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        return taxLotTableInputCellState.copy(str, str2, str3, toggleableState, z5, z6, t2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    /* renamed from: component4, reason: from getter */
    public final ToggleableState getToggleableState() {
        return this.toggleableState;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public final T component7() {
        return this.tapAction;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final TaxLotTableInputCellState<T> copy(String id, String value, String placeholderText, ToggleableState toggleableState, boolean enabled, boolean isError, T tapAction, boolean isFocused) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(toggleableState, "toggleableState");
        return new TaxLotTableInputCellState<>(id, value, placeholderText, toggleableState, enabled, isError, tapAction, isFocused);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotTableInputCellState)) {
            return false;
        }
        TaxLotTableInputCellState taxLotTableInputCellState = (TaxLotTableInputCellState) other;
        return Intrinsics.areEqual(this.id, taxLotTableInputCellState.id) && Intrinsics.areEqual(this.value, taxLotTableInputCellState.value) && Intrinsics.areEqual(this.placeholderText, taxLotTableInputCellState.placeholderText) && this.toggleableState == taxLotTableInputCellState.toggleableState && this.enabled == taxLotTableInputCellState.enabled && this.isError == taxLotTableInputCellState.isError && Intrinsics.areEqual(this.tapAction, taxLotTableInputCellState.tapAction) && this.isFocused == taxLotTableInputCellState.isFocused;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.value.hashCode()) * 31) + this.placeholderText.hashCode()) * 31) + this.toggleableState.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isError)) * 31;
        T t = this.tapAction;
        return ((iHashCode + (t == null ? 0 : t.hashCode())) * 31) + Boolean.hashCode(this.isFocused);
    }

    public String toString() {
        return "TaxLotTableInputCellState(id=" + this.id + ", value=" + this.value + ", placeholderText=" + this.placeholderText + ", toggleableState=" + this.toggleableState + ", enabled=" + this.enabled + ", isError=" + this.isError + ", tapAction=" + this.tapAction + ", isFocused=" + this.isFocused + ")";
    }

    public TaxLotTableInputCellState(String id, String value, String placeholderText, ToggleableState toggleableState, boolean z, boolean z2, T t, boolean z3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholderText, "placeholderText");
        Intrinsics.checkNotNullParameter(toggleableState, "toggleableState");
        this.id = id;
        this.value = value;
        this.placeholderText = placeholderText;
        this.toggleableState = toggleableState;
        this.enabled = z;
        this.isError = z2;
        this.tapAction = t;
        this.isFocused = z3;
        this.isEmpty = value.length() == 0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TaxLotTableInputCellState(java.lang.String r12, java.lang.String r13, java.lang.String r14, androidx.compose.p011ui.state.ToggleableState r15, boolean r16, boolean r17, java.lang.Object r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 1
            r7 = r1
            goto Lb
        L9:
            r7 = r16
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r17
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1b
            r1 = 0
            r9 = r1
            goto L1d
        L1b:
            r9 = r18
        L1d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L28
            r10 = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r2 = r11
            goto L2f
        L28:
            r10 = r19
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
        L2f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.taxLots.views.TaxLotTableInputCellState.<init>(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.state.ToggleableState, boolean, boolean, java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return this.id;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    public final ToggleableState getToggleableState() {
        return this.toggleableState;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final T getTapAction() {
        return this.tapAction;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    public final TextFieldValue getTextFieldValue() {
        String str = this.value;
        return new TextFieldValue(str, this.isFocused ? TextRange2.TextRange(str.length()) : TextRange.INSTANCE.m7651getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    public final TextFieldValue getPlaceholderTextFieldValue() {
        String str = this.placeholderText;
        return new TextFieldValue(str, this.isFocused ? TextRange2.TextRange(str.length()) : TextRange.INSTANCE.m7651getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }
}
