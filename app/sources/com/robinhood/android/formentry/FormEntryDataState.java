package com.robinhood.android.formentry;

import com.robinhood.android.formentry.data.FormEntryMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormReviewItemDto;

/* compiled from: FormEntryDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/formentry/FormEntryDataState;", "", "fields", "", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "reviewItems", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormReviewItemDto;", "mode", "Lcom/robinhood/android/formentry/data/FormEntryMode;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/robinhood/android/formentry/data/FormEntryMode;)V", "getFields", "()Ljava/util/List;", "getReviewItems", "getMode", "()Lcom/robinhood/android/formentry/data/FormEntryMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-form-entry_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormEntryDataState {
    public static final int $stable = 8;
    private final List<FormInputDto> fields;
    private final FormEntryMode mode;
    private final List<FormReviewItemDto> reviewItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormEntryDataState copy$default(FormEntryDataState formEntryDataState, List list, List list2, FormEntryMode formEntryMode, int i, Object obj) {
        if ((i & 1) != 0) {
            list = formEntryDataState.fields;
        }
        if ((i & 2) != 0) {
            list2 = formEntryDataState.reviewItems;
        }
        if ((i & 4) != 0) {
            formEntryMode = formEntryDataState.mode;
        }
        return formEntryDataState.copy(list, list2, formEntryMode);
    }

    public final List<FormInputDto> component1() {
        return this.fields;
    }

    public final List<FormReviewItemDto> component2() {
        return this.reviewItems;
    }

    /* renamed from: component3, reason: from getter */
    public final FormEntryMode getMode() {
        return this.mode;
    }

    public final FormEntryDataState copy(List<FormInputDto> fields, List<FormReviewItemDto> reviewItems, FormEntryMode mode) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(reviewItems, "reviewItems");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new FormEntryDataState(fields, reviewItems, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormEntryDataState)) {
            return false;
        }
        FormEntryDataState formEntryDataState = (FormEntryDataState) other;
        return Intrinsics.areEqual(this.fields, formEntryDataState.fields) && Intrinsics.areEqual(this.reviewItems, formEntryDataState.reviewItems) && this.mode == formEntryDataState.mode;
    }

    public int hashCode() {
        return (((this.fields.hashCode() * 31) + this.reviewItems.hashCode()) * 31) + this.mode.hashCode();
    }

    public String toString() {
        return "FormEntryDataState(fields=" + this.fields + ", reviewItems=" + this.reviewItems + ", mode=" + this.mode + ")";
    }

    public FormEntryDataState(List<FormInputDto> fields, List<FormReviewItemDto> reviewItems, FormEntryMode mode) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(reviewItems, "reviewItems");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.fields = fields;
        this.reviewItems = reviewItems;
        this.mode = mode;
    }

    public final List<FormInputDto> getFields() {
        return this.fields;
    }

    public final List<FormReviewItemDto> getReviewItems() {
        return this.reviewItems;
    }

    public final FormEntryMode getMode() {
        return this.mode;
    }
}
