package com.truelayer.payments.p419ui.components.toolbars;

import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibleTopAppBar.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;", "", "Lkotlin/Function0;", "", "component", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "accessibilityAction", "<init>", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/semantics/CustomAccessibilityAction;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "component2", "()Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "copy", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/semantics/CustomAccessibilityAction;)Lcom/truelayer/payments/ui/components/toolbars/AccessibleAppBarAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function2;", "getComponent", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getAccessibilityAction", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccessibleAppBarAction {
    public static final int $stable = CustomAccessibilityAction.$stable;
    private final CustomAccessibilityAction accessibilityAction;
    private final Function2<Composer, Integer, Unit> component;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessibleAppBarAction copy$default(AccessibleAppBarAction accessibleAppBarAction, Function2 function2, CustomAccessibilityAction customAccessibilityAction, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = accessibleAppBarAction.component;
        }
        if ((i & 2) != 0) {
            customAccessibilityAction = accessibleAppBarAction.accessibilityAction;
        }
        return accessibleAppBarAction.copy(function2, customAccessibilityAction);
    }

    public final Function2<Composer, Integer, Unit> component1() {
        return this.component;
    }

    /* renamed from: component2, reason: from getter */
    public final CustomAccessibilityAction getAccessibilityAction() {
        return this.accessibilityAction;
    }

    public final AccessibleAppBarAction copy(Function2<? super Composer, ? super Integer, Unit> component, CustomAccessibilityAction accessibilityAction) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(accessibilityAction, "accessibilityAction");
        return new AccessibleAppBarAction(component, accessibilityAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibleAppBarAction)) {
            return false;
        }
        AccessibleAppBarAction accessibleAppBarAction = (AccessibleAppBarAction) other;
        return Intrinsics.areEqual(this.component, accessibleAppBarAction.component) && Intrinsics.areEqual(this.accessibilityAction, accessibleAppBarAction.accessibilityAction);
    }

    public int hashCode() {
        return (this.component.hashCode() * 31) + this.accessibilityAction.hashCode();
    }

    public String toString() {
        return "AccessibleAppBarAction(component=" + this.component + ", accessibilityAction=" + this.accessibilityAction + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccessibleAppBarAction(Function2<? super Composer, ? super Integer, Unit> component, CustomAccessibilityAction accessibilityAction) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(accessibilityAction, "accessibilityAction");
        this.component = component;
        this.accessibilityAction = accessibilityAction;
    }

    public final Function2<Composer, Integer, Unit> getComponent() {
        return this.component;
    }

    public final CustomAccessibilityAction getAccessibilityAction() {
        return this.accessibilityAction;
    }
}
