package com.robinhood.android.formentry;

import com.robinhood.android.formentry.data.FormEntryMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormReviewItemDto;

/* compiled from: FormEntryViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/formentry/FormEntryViewState;", "", "fields", "Lkotlinx/collections/immutable/ImmutableList;", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInputDto;", "reviewItems", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormReviewItemDto;", "mode", "Lcom/robinhood/android/formentry/data/FormEntryMode;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/formentry/data/FormEntryMode;)V", "getFields", "()Lkotlinx/collections/immutable/ImmutableList;", "getReviewItems", "getMode", "()Lcom/robinhood/android/formentry/data/FormEntryMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-form-entry_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormEntryViewState {
    public static final int $stable = 8;
    private final ImmutableList<FormInputDto> fields;
    private final FormEntryMode mode;
    private final ImmutableList<FormReviewItemDto> reviewItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormEntryViewState copy$default(FormEntryViewState formEntryViewState, ImmutableList immutableList, ImmutableList immutableList2, FormEntryMode formEntryMode, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = formEntryViewState.fields;
        }
        if ((i & 2) != 0) {
            immutableList2 = formEntryViewState.reviewItems;
        }
        if ((i & 4) != 0) {
            formEntryMode = formEntryViewState.mode;
        }
        return formEntryViewState.copy(immutableList, immutableList2, formEntryMode);
    }

    public final ImmutableList<FormInputDto> component1() {
        return this.fields;
    }

    public final ImmutableList<FormReviewItemDto> component2() {
        return this.reviewItems;
    }

    /* renamed from: component3, reason: from getter */
    public final FormEntryMode getMode() {
        return this.mode;
    }

    public final FormEntryViewState copy(ImmutableList<FormInputDto> fields, ImmutableList<FormReviewItemDto> reviewItems, FormEntryMode mode) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(reviewItems, "reviewItems");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new FormEntryViewState(fields, reviewItems, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormEntryViewState)) {
            return false;
        }
        FormEntryViewState formEntryViewState = (FormEntryViewState) other;
        return Intrinsics.areEqual(this.fields, formEntryViewState.fields) && Intrinsics.areEqual(this.reviewItems, formEntryViewState.reviewItems) && this.mode == formEntryViewState.mode;
    }

    public int hashCode() {
        return (((this.fields.hashCode() * 31) + this.reviewItems.hashCode()) * 31) + this.mode.hashCode();
    }

    public String toString() {
        return "FormEntryViewState(fields=" + this.fields + ", reviewItems=" + this.reviewItems + ", mode=" + this.mode + ")";
    }

    public FormEntryViewState(ImmutableList<FormInputDto> fields, ImmutableList<FormReviewItemDto> reviewItems, FormEntryMode mode) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(reviewItems, "reviewItems");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.fields = fields;
        this.reviewItems = reviewItems;
        this.mode = mode;
    }

    public final ImmutableList<FormInputDto> getFields() {
        return this.fields;
    }

    public final ImmutableList<FormReviewItemDto> getReviewItems() {
        return this.reviewItems;
    }

    public final FormEntryMode getMode() {
        return this.mode;
    }
}
