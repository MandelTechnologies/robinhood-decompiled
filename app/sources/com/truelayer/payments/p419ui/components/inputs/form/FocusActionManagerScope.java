package com.truelayer.payments.p419ui.components.inputs.form;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.input.ImeAction;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusActionManager.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\u0016\u001a\u00020\tHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m3636d2 = {"Lcom/truelayer/payments/ui/components/inputs/form/FocusActionManagerScope;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "focusModifier", "Landroidx/compose/ui/Modifier;", "actions", "Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;", "ime", "Landroidx/compose/ui/text/input/ImeAction;", "(ILandroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActions", "()Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;", "getFocusModifier", "()Landroidx/compose/ui/Modifier;", "getIme-eUduSuo", "()I", "I", "getIndex", "component1", "component2", "component3", "component4", "component4-eUduSuo", "copy", "copy-EoeL6lk", "(ILandroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;I)Lcom/truelayer/payments/ui/components/inputs/form/FocusActionManagerScope;", "equals", "", "other", "hashCode", "toString", "", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FocusActionManagerScope {
    public static final int $stable = 0;
    private final FocusActions actions;
    private final Modifier focusModifier;
    private final int ime;
    private final int index;

    public /* synthetic */ FocusActionManagerScope(int i, Modifier modifier, FocusActions focusActions, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, modifier, focusActions, i2);
    }

    /* renamed from: copy-EoeL6lk$default, reason: not valid java name */
    public static /* synthetic */ FocusActionManagerScope m27061copyEoeL6lk$default(FocusActionManagerScope focusActionManagerScope, int i, Modifier modifier, FocusActions focusActions, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = focusActionManagerScope.index;
        }
        if ((i3 & 2) != 0) {
            modifier = focusActionManagerScope.focusModifier;
        }
        if ((i3 & 4) != 0) {
            focusActions = focusActionManagerScope.actions;
        }
        if ((i3 & 8) != 0) {
            i2 = focusActionManagerScope.ime;
        }
        return focusActionManagerScope.m27063copyEoeL6lk(i, modifier, focusActions, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final Modifier getFocusModifier() {
        return this.focusModifier;
    }

    /* renamed from: component3, reason: from getter */
    public final FocusActions getActions() {
        return this.actions;
    }

    /* renamed from: component4-eUduSuo, reason: not valid java name and from getter */
    public final int getIme() {
        return this.ime;
    }

    /* renamed from: copy-EoeL6lk, reason: not valid java name */
    public final FocusActionManagerScope m27063copyEoeL6lk(int index, Modifier focusModifier, FocusActions actions, int ime) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new FocusActionManagerScope(index, focusModifier, actions, ime, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusActionManagerScope)) {
            return false;
        }
        FocusActionManagerScope focusActionManagerScope = (FocusActionManagerScope) other;
        return this.index == focusActionManagerScope.index && Intrinsics.areEqual(this.focusModifier, focusActionManagerScope.focusModifier) && Intrinsics.areEqual(this.actions, focusActionManagerScope.actions) && ImeAction.m7742equalsimpl0(this.ime, focusActionManagerScope.ime);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.index) * 31) + this.focusModifier.hashCode()) * 31) + this.actions.hashCode()) * 31) + ImeAction.m7743hashCodeimpl(this.ime);
    }

    public String toString() {
        return "FocusActionManagerScope(index=" + this.index + ", focusModifier=" + this.focusModifier + ", actions=" + this.actions + ", ime=" + ImeAction.m7744toStringimpl(this.ime) + ")";
    }

    private FocusActionManagerScope(int i, Modifier focusModifier, FocusActions actions, int i2) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.index = i;
        this.focusModifier = focusModifier;
        this.actions = actions;
        this.ime = i2;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Modifier getFocusModifier() {
        return this.focusModifier;
    }

    public final FocusActions getActions() {
        return this.actions;
    }

    /* renamed from: getIme-eUduSuo, reason: not valid java name */
    public final int m27064getImeeUduSuo() {
        return this.ime;
    }
}
