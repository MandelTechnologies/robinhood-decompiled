package com.robinhood.android.pathfinder.corepages.simpleinput;

import com.robinhood.models.p355ui.pathfinder.contexts.SimpleInputContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleInputViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/simpleinput/SimpleInputViewState;", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/SimpleInputContext;", "sendingInput", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/SimpleInputContext;Z)V", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/SimpleInputContext;", "getSendingInput", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SimpleInputViewState {
    public static final int $stable = 8;
    private final SimpleInputContext context;
    private final boolean sendingInput;

    public static /* synthetic */ SimpleInputViewState copy$default(SimpleInputViewState simpleInputViewState, SimpleInputContext simpleInputContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleInputContext = simpleInputViewState.context;
        }
        if ((i & 2) != 0) {
            z = simpleInputViewState.sendingInput;
        }
        return simpleInputViewState.copy(simpleInputContext, z);
    }

    /* renamed from: component1, reason: from getter */
    public final SimpleInputContext getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSendingInput() {
        return this.sendingInput;
    }

    public final SimpleInputViewState copy(SimpleInputContext context, boolean sendingInput) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SimpleInputViewState(context, sendingInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleInputViewState)) {
            return false;
        }
        SimpleInputViewState simpleInputViewState = (SimpleInputViewState) other;
        return Intrinsics.areEqual(this.context, simpleInputViewState.context) && this.sendingInput == simpleInputViewState.sendingInput;
    }

    public int hashCode() {
        return (this.context.hashCode() * 31) + Boolean.hashCode(this.sendingInput);
    }

    public String toString() {
        return "SimpleInputViewState(context=" + this.context + ", sendingInput=" + this.sendingInput + ")";
    }

    public SimpleInputViewState(SimpleInputContext context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.sendingInput = z;
    }

    public /* synthetic */ SimpleInputViewState(SimpleInputContext simpleInputContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleInputContext, (i & 2) != 0 ? false : z);
    }

    public final SimpleInputContext getContext() {
        return this.context;
    }

    public final boolean getSendingInput() {
        return this.sendingInput;
    }
}
