package com.truelayer.payments.p419ui.components.inputs.form;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusActionManager.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;", "", "next", "Lkotlin/Function0;", "", "prev", "clear", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getClear", "()Lkotlin/jvm/functions/Function0;", "getNext", "getPrev", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FocusActions {
    public static final int $stable = 0;
    private final Function0<Unit> clear;
    private final Function0<Unit> next;
    private final Function0<Unit> prev;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FocusActions copy$default(FocusActions focusActions, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = focusActions.next;
        }
        if ((i & 2) != 0) {
            function02 = focusActions.prev;
        }
        if ((i & 4) != 0) {
            function03 = focusActions.clear;
        }
        return focusActions.copy(function0, function02, function03);
    }

    public final Function0<Unit> component1() {
        return this.next;
    }

    public final Function0<Unit> component2() {
        return this.prev;
    }

    public final Function0<Unit> component3() {
        return this.clear;
    }

    public final FocusActions copy(Function0<Unit> next, Function0<Unit> prev, Function0<Unit> clear) {
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(clear, "clear");
        return new FocusActions(next, prev, clear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusActions)) {
            return false;
        }
        FocusActions focusActions = (FocusActions) other;
        return Intrinsics.areEqual(this.next, focusActions.next) && Intrinsics.areEqual(this.prev, focusActions.prev) && Intrinsics.areEqual(this.clear, focusActions.clear);
    }

    public int hashCode() {
        return (((this.next.hashCode() * 31) + this.prev.hashCode()) * 31) + this.clear.hashCode();
    }

    public String toString() {
        return "FocusActions(next=" + this.next + ", prev=" + this.prev + ", clear=" + this.clear + ")";
    }

    public FocusActions(Function0<Unit> next, Function0<Unit> prev, Function0<Unit> clear) {
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(clear, "clear");
        this.next = next;
        this.prev = prev;
        this.clear = clear;
    }

    public final Function0<Unit> getNext() {
        return this.next;
    }

    public final Function0<Unit> getPrev() {
        return this.prev;
    }

    public final Function0<Unit> getClear() {
        return this.clear;
    }
}
