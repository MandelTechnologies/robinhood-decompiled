package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2DropdownChipViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DropdownChipViewState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferV2DropdownChipViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource text;

    public static /* synthetic */ CreateTransferV2DropdownChipViewState copy$default(CreateTransferV2DropdownChipViewState createTransferV2DropdownChipViewState, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = createTransferV2DropdownChipViewState.text;
        }
        return createTransferV2DropdownChipViewState.copy(stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    public final CreateTransferV2DropdownChipViewState copy(StringResource text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new CreateTransferV2DropdownChipViewState(text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateTransferV2DropdownChipViewState) && Intrinsics.areEqual(this.text, ((CreateTransferV2DropdownChipViewState) other).text);
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        return "CreateTransferV2DropdownChipViewState(text=" + this.text + ")";
    }

    public CreateTransferV2DropdownChipViewState(StringResource text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
    }

    public final StringResource getText() {
        return this.text;
    }
}
