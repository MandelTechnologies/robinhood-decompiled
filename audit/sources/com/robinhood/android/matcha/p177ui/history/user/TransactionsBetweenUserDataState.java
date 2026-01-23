package com.robinhood.android.matcha.p177ui.history.user;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionsBetweenUserDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserDataState;", "", "components", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Ljava/util/List;Lcom/robinhood/udf/UiEvent;)V", "getComponents", "()Ljava/util/List;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransactionsBetweenUserDataState {
    public static final int $stable = 8;
    private final List<UIComponent<GenericAction>> components;
    private final UiEvent<Throwable> errorEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionsBetweenUserDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionsBetweenUserDataState copy$default(TransactionsBetweenUserDataState transactionsBetweenUserDataState, List list, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionsBetweenUserDataState.components;
        }
        if ((i & 2) != 0) {
            uiEvent = transactionsBetweenUserDataState.errorEvent;
        }
        return transactionsBetweenUserDataState.copy(list, uiEvent);
    }

    public final List<UIComponent<GenericAction>> component1() {
        return this.components;
    }

    public final UiEvent<Throwable> component2() {
        return this.errorEvent;
    }

    public final TransactionsBetweenUserDataState copy(List<? extends UIComponent<? extends GenericAction>> components, UiEvent<Throwable> errorEvent) {
        return new TransactionsBetweenUserDataState(components, errorEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsBetweenUserDataState)) {
            return false;
        }
        TransactionsBetweenUserDataState transactionsBetweenUserDataState = (TransactionsBetweenUserDataState) other;
        return Intrinsics.areEqual(this.components, transactionsBetweenUserDataState.components) && Intrinsics.areEqual(this.errorEvent, transactionsBetweenUserDataState.errorEvent);
    }

    public int hashCode() {
        List<UIComponent<GenericAction>> list = this.components;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "TransactionsBetweenUserDataState(components=" + this.components + ", errorEvent=" + this.errorEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionsBetweenUserDataState(List<? extends UIComponent<? extends GenericAction>> list, UiEvent<Throwable> uiEvent) {
        this.components = list;
        this.errorEvent = uiEvent;
    }

    public /* synthetic */ TransactionsBetweenUserDataState(List list, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : uiEvent);
    }

    public final List<UIComponent<GenericAction>> getComponents() {
        return this.components;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }
}
