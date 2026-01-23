package com.robinhood.android.doc.p109ui.persona;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaStartViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaStartViewState;", "", "isLoading", "", "disclosureText", "", "<init>", "(ZLjava/lang/CharSequence;)V", "()Z", "getDisclosureText", "()Ljava/lang/CharSequence;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PersonaStartViewState {
    public static final int $stable = 8;
    private final CharSequence disclosureText;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public PersonaStartViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PersonaStartViewState copy$default(PersonaStartViewState personaStartViewState, boolean z, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            z = personaStartViewState.isLoading;
        }
        if ((i & 2) != 0) {
            charSequence = personaStartViewState.disclosureText;
        }
        return personaStartViewState.copy(z, charSequence);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getDisclosureText() {
        return this.disclosureText;
    }

    public final PersonaStartViewState copy(boolean isLoading, CharSequence disclosureText) {
        return new PersonaStartViewState(isLoading, disclosureText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonaStartViewState)) {
            return false;
        }
        PersonaStartViewState personaStartViewState = (PersonaStartViewState) other;
        return this.isLoading == personaStartViewState.isLoading && Intrinsics.areEqual(this.disclosureText, personaStartViewState.disclosureText);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        CharSequence charSequence = this.disclosureText;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public String toString() {
        return "PersonaStartViewState(isLoading=" + this.isLoading + ", disclosureText=" + ((Object) this.disclosureText) + ")";
    }

    public PersonaStartViewState(boolean z, CharSequence charSequence) {
        this.isLoading = z;
        this.disclosureText = charSequence;
    }

    public /* synthetic */ PersonaStartViewState(boolean z, CharSequence charSequence, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : charSequence);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final CharSequence getDisclosureText() {
        return this.disclosureText;
    }
}
