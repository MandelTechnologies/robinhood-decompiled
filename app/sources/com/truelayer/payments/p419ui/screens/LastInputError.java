package com.truelayer.payments.p419ui.screens;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Screen.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/truelayer/payments/ui/screens/LastInputError;", "", "value", "", "errors", "", "(Ljava/lang/String;Ljava/util/List;)V", "errorMessage", "getErrorMessage", "()Ljava/lang/String;", "getErrors", "()Ljava/util/List;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LastInputError {
    public static final int $stable = 8;
    private final List<String> errors;
    private final String value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastInputError copy$default(LastInputError lastInputError, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastInputError.value;
        }
        if ((i & 2) != 0) {
            list = lastInputError.errors;
        }
        return lastInputError.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final List<String> component2() {
        return this.errors;
    }

    public final LastInputError copy(String value, List<String> errors) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new LastInputError(value, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastInputError)) {
            return false;
        }
        LastInputError lastInputError = (LastInputError) other;
        return Intrinsics.areEqual(this.value, lastInputError.value) && Intrinsics.areEqual(this.errors, lastInputError.errors);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "LastInputError(value=" + this.value + ", errors=" + this.errors + ")";
    }

    public LastInputError(String value, List<String> errors) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.value = value;
        this.errors = errors;
    }

    public final String getValue() {
        return this.value;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final String getErrorMessage() {
        return CollectionsKt.joinToString$default(this.errors, PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null);
    }
}
