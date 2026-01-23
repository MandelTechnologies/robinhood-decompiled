package com.robinhood.compose.bento.component;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: BentoToast.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoToastAction;", "", AnnotatedPrivateKey.LABEL, "", "dismissAfterActionTap", "", "onActionTextClicked", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getLabel", "()Ljava/lang/String;", "getDismissAfterActionTap", "()Z", "getOnActionTextClicked", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BentoToastAction {
    public static final int $stable = 0;
    private final boolean dismissAfterActionTap;
    private final String label;
    private final Function0<Unit> onActionTextClicked;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BentoToastAction copy$default(BentoToastAction bentoToastAction, String str, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bentoToastAction.label;
        }
        if ((i & 2) != 0) {
            z = bentoToastAction.dismissAfterActionTap;
        }
        if ((i & 4) != 0) {
            function0 = bentoToastAction.onActionTextClicked;
        }
        return bentoToastAction.copy(str, z, function0);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDismissAfterActionTap() {
        return this.dismissAfterActionTap;
    }

    public final Function0<Unit> component3() {
        return this.onActionTextClicked;
    }

    public final BentoToastAction copy(String label, boolean dismissAfterActionTap, Function0<Unit> onActionTextClicked) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onActionTextClicked, "onActionTextClicked");
        return new BentoToastAction(label, dismissAfterActionTap, onActionTextClicked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BentoToastAction)) {
            return false;
        }
        BentoToastAction bentoToastAction = (BentoToastAction) other;
        return Intrinsics.areEqual(this.label, bentoToastAction.label) && this.dismissAfterActionTap == bentoToastAction.dismissAfterActionTap && Intrinsics.areEqual(this.onActionTextClicked, bentoToastAction.onActionTextClicked);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + Boolean.hashCode(this.dismissAfterActionTap)) * 31) + this.onActionTextClicked.hashCode();
    }

    public String toString() {
        return "BentoToastAction(label=" + this.label + ", dismissAfterActionTap=" + this.dismissAfterActionTap + ", onActionTextClicked=" + this.onActionTextClicked + ")";
    }

    public BentoToastAction(String label, boolean z, Function0<Unit> onActionTextClicked) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onActionTextClicked, "onActionTextClicked");
        this.label = label;
        this.dismissAfterActionTap = z;
        this.onActionTextClicked = onActionTextClicked;
    }

    public /* synthetic */ BentoToastAction(String str, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, function0);
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getDismissAfterActionTap() {
        return this.dismissAfterActionTap;
    }

    public final Function0<Unit> getOnActionTextClicked() {
        return this.onActionTextClicked;
    }
}
