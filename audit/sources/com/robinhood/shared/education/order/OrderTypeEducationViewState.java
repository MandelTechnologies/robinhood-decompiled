package com.robinhood.shared.education.order;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationViewState;", "", "prompt", "Lcom/robinhood/utils/resource/StringResource;", "showDismissButton", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Z)V", "getPrompt", "()Lcom/robinhood/utils/resource/StringResource;", "getShowDismissButton", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OrderTypeEducationViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource prompt;
    private final boolean showDismissButton;

    public static /* synthetic */ OrderTypeEducationViewState copy$default(OrderTypeEducationViewState orderTypeEducationViewState, StringResource stringResource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = orderTypeEducationViewState.prompt;
        }
        if ((i & 2) != 0) {
            z = orderTypeEducationViewState.showDismissButton;
        }
        return orderTypeEducationViewState.copy(stringResource, z);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getPrompt() {
        return this.prompt;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowDismissButton() {
        return this.showDismissButton;
    }

    public final OrderTypeEducationViewState copy(StringResource prompt, boolean showDismissButton) {
        return new OrderTypeEducationViewState(prompt, showDismissButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTypeEducationViewState)) {
            return false;
        }
        OrderTypeEducationViewState orderTypeEducationViewState = (OrderTypeEducationViewState) other;
        return Intrinsics.areEqual(this.prompt, orderTypeEducationViewState.prompt) && this.showDismissButton == orderTypeEducationViewState.showDismissButton;
    }

    public int hashCode() {
        StringResource stringResource = this.prompt;
        return ((stringResource == null ? 0 : stringResource.hashCode()) * 31) + Boolean.hashCode(this.showDismissButton);
    }

    public String toString() {
        return "OrderTypeEducationViewState(prompt=" + this.prompt + ", showDismissButton=" + this.showDismissButton + ")";
    }

    public OrderTypeEducationViewState(StringResource stringResource, boolean z) {
        this.prompt = stringResource;
        this.showDismissButton = z;
    }

    public final StringResource getPrompt() {
        return this.prompt;
    }

    public final boolean getShowDismissButton() {
        return this.showDismissButton;
    }
}
