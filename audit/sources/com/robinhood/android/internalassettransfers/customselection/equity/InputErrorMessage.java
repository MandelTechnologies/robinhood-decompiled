package com.robinhood.android.internalassettransfers.customselection.equity;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferEquityEditViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/InputErrorMessage;", "", "message", "Lcom/robinhood/utils/resource/StringResource;", "useNegativeColor", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "getUseNegativeColor", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InputErrorMessage {
    public static final int $stable = StringResource.$stable;
    private final StringResource message;
    private final boolean useNegativeColor;

    public static /* synthetic */ InputErrorMessage copy$default(InputErrorMessage inputErrorMessage, StringResource stringResource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = inputErrorMessage.message;
        }
        if ((i & 2) != 0) {
            z = inputErrorMessage.useNegativeColor;
        }
        return inputErrorMessage.copy(stringResource, z);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getUseNegativeColor() {
        return this.useNegativeColor;
    }

    public final InputErrorMessage copy(StringResource message, boolean useNegativeColor) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new InputErrorMessage(message, useNegativeColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputErrorMessage)) {
            return false;
        }
        InputErrorMessage inputErrorMessage = (InputErrorMessage) other;
        return Intrinsics.areEqual(this.message, inputErrorMessage.message) && this.useNegativeColor == inputErrorMessage.useNegativeColor;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + Boolean.hashCode(this.useNegativeColor);
    }

    public String toString() {
        return "InputErrorMessage(message=" + this.message + ", useNegativeColor=" + this.useNegativeColor + ")";
    }

    public InputErrorMessage(StringResource message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.useNegativeColor = z;
    }

    public final StringResource getMessage() {
        return this.message;
    }

    public final boolean getUseNegativeColor() {
        return this.useNegativeColor;
    }
}
