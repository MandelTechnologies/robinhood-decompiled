package com.robinhood.android.formentry.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormCellViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/formentry/data/FormCellViewState;", "", "header", "", "currentValue", "placeholder", "position", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getHeader", "()Ljava/lang/String;", "getCurrentValue", "getPlaceholder", "getPosition", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "lib-form-entry_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormCellViewState {
    public static final int $stable = 0;
    private final String currentValue;
    private final String header;
    private final String placeholder;
    private final int position;

    public FormCellViewState() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ FormCellViewState copy$default(FormCellViewState formCellViewState, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = formCellViewState.header;
        }
        if ((i2 & 2) != 0) {
            str2 = formCellViewState.currentValue;
        }
        if ((i2 & 4) != 0) {
            str3 = formCellViewState.placeholder;
        }
        if ((i2 & 8) != 0) {
            i = formCellViewState.position;
        }
        return formCellViewState.copy(str, str2, str3, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentValue() {
        return this.currentValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public final FormCellViewState copy(String header, String currentValue, String placeholder, int position) {
        return new FormCellViewState(header, currentValue, placeholder, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormCellViewState)) {
            return false;
        }
        FormCellViewState formCellViewState = (FormCellViewState) other;
        return Intrinsics.areEqual(this.header, formCellViewState.header) && Intrinsics.areEqual(this.currentValue, formCellViewState.currentValue) && Intrinsics.areEqual(this.placeholder, formCellViewState.placeholder) && this.position == formCellViewState.position;
    }

    public int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currentValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.position);
    }

    public String toString() {
        return "FormCellViewState(header=" + this.header + ", currentValue=" + this.currentValue + ", placeholder=" + this.placeholder + ", position=" + this.position + ")";
    }

    public FormCellViewState(String str, String str2, String str3, int i) {
        this.header = str;
        this.currentValue = str2;
        this.placeholder = str3;
        this.position = i;
    }

    public /* synthetic */ FormCellViewState(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final int getPosition() {
        return this.position;
    }
}
