package com.robinhood.android.crypto.costbasis.details.entry;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoCostBasisEntryViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryViewState;", "", "isLoading", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "inputRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "isSaveButtonEnabled", "isSaveButtonLoading", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZZ)V", "()Z", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getInputRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoCostBasisEntryViewState {
    public static final int $stable = StringResource.$stable;
    private final ImmutableList<InputRow> inputRows;
    private final boolean isLoading;
    private final boolean isSaveButtonEnabled;
    private final boolean isSaveButtonLoading;
    private final StringResource subtitle;

    public static /* synthetic */ CryptoCostBasisEntryViewState copy$default(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, boolean z, StringResource stringResource, ImmutableList immutableList, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoCostBasisEntryViewState.isLoading;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoCostBasisEntryViewState.subtitle;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoCostBasisEntryViewState.inputRows;
        }
        if ((i & 8) != 0) {
            z2 = cryptoCostBasisEntryViewState.isSaveButtonEnabled;
        }
        if ((i & 16) != 0) {
            z3 = cryptoCostBasisEntryViewState.isSaveButtonLoading;
        }
        boolean z4 = z3;
        ImmutableList immutableList2 = immutableList;
        return cryptoCostBasisEntryViewState.copy(z, stringResource, immutableList2, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<InputRow> component3() {
        return this.inputRows;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSaveButtonEnabled() {
        return this.isSaveButtonEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSaveButtonLoading() {
        return this.isSaveButtonLoading;
    }

    public final CryptoCostBasisEntryViewState copy(boolean isLoading, StringResource subtitle, ImmutableList<? extends InputRow> inputRows, boolean isSaveButtonEnabled, boolean isSaveButtonLoading) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputRows, "inputRows");
        return new CryptoCostBasisEntryViewState(isLoading, subtitle, inputRows, isSaveButtonEnabled, isSaveButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoCostBasisEntryViewState)) {
            return false;
        }
        CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState = (CryptoCostBasisEntryViewState) other;
        return this.isLoading == cryptoCostBasisEntryViewState.isLoading && Intrinsics.areEqual(this.subtitle, cryptoCostBasisEntryViewState.subtitle) && Intrinsics.areEqual(this.inputRows, cryptoCostBasisEntryViewState.inputRows) && this.isSaveButtonEnabled == cryptoCostBasisEntryViewState.isSaveButtonEnabled && this.isSaveButtonLoading == cryptoCostBasisEntryViewState.isSaveButtonLoading;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + this.subtitle.hashCode()) * 31) + this.inputRows.hashCode()) * 31) + Boolean.hashCode(this.isSaveButtonEnabled)) * 31) + Boolean.hashCode(this.isSaveButtonLoading);
    }

    public String toString() {
        return "CryptoCostBasisEntryViewState(isLoading=" + this.isLoading + ", subtitle=" + this.subtitle + ", inputRows=" + this.inputRows + ", isSaveButtonEnabled=" + this.isSaveButtonEnabled + ", isSaveButtonLoading=" + this.isSaveButtonLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoCostBasisEntryViewState(boolean z, StringResource subtitle, ImmutableList<? extends InputRow> inputRows, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputRows, "inputRows");
        this.isLoading = z;
        this.subtitle = subtitle;
        this.inputRows = inputRows;
        this.isSaveButtonEnabled = z2;
        this.isSaveButtonLoading = z3;
    }

    public /* synthetic */ CryptoCostBasisEntryViewState(boolean z, StringResource stringResource, ImmutableList immutableList, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, stringResource, immutableList, z2, z3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<InputRow> getInputRows() {
        return this.inputRows;
    }

    public final boolean isSaveButtonEnabled() {
        return this.isSaveButtonEnabled;
    }

    public final boolean isSaveButtonLoading() {
        return this.isSaveButtonLoading;
    }
}
