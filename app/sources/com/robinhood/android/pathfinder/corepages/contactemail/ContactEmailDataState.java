package com.robinhood.android.pathfinder.corepages.contactemail;

import com.robinhood.models.p355ui.pathfinder.contexts.ContactEmailContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactEmailDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailDataState;", "", "isSending", "", "emailInput", "", "descriptionInput", "optionalFieldInputs", "", "contactEmailContext", "Lcom/robinhood/models/ui/pathfinder/contexts/ContactEmailContext;", "canShowEmailError", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/models/ui/pathfinder/contexts/ContactEmailContext;Z)V", "()Z", "getEmailInput", "()Ljava/lang/String;", "getDescriptionInput", "getOptionalFieldInputs", "()Ljava/util/Map;", "getContactEmailContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/ContactEmailContext;", "getCanShowEmailError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContactEmailDataState {
    public static final int $stable = 8;
    private final boolean canShowEmailError;
    private final ContactEmailContext contactEmailContext;
    private final String descriptionInput;
    private final String emailInput;
    private final boolean isSending;
    private final Map<String, String> optionalFieldInputs;

    public static /* synthetic */ ContactEmailDataState copy$default(ContactEmailDataState contactEmailDataState, boolean z, String str, String str2, Map map, ContactEmailContext contactEmailContext, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contactEmailDataState.isSending;
        }
        if ((i & 2) != 0) {
            str = contactEmailDataState.emailInput;
        }
        if ((i & 4) != 0) {
            str2 = contactEmailDataState.descriptionInput;
        }
        if ((i & 8) != 0) {
            map = contactEmailDataState.optionalFieldInputs;
        }
        if ((i & 16) != 0) {
            contactEmailContext = contactEmailDataState.contactEmailContext;
        }
        if ((i & 32) != 0) {
            z2 = contactEmailDataState.canShowEmailError;
        }
        ContactEmailContext contactEmailContext2 = contactEmailContext;
        boolean z3 = z2;
        return contactEmailDataState.copy(z, str, str2, map, contactEmailContext2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmailInput() {
        return this.emailInput;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescriptionInput() {
        return this.descriptionInput;
    }

    public final Map<String, String> component4() {
        return this.optionalFieldInputs;
    }

    /* renamed from: component5, reason: from getter */
    public final ContactEmailContext getContactEmailContext() {
        return this.contactEmailContext;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getCanShowEmailError() {
        return this.canShowEmailError;
    }

    public final ContactEmailDataState copy(boolean isSending, String emailInput, String descriptionInput, Map<String, String> optionalFieldInputs, ContactEmailContext contactEmailContext, boolean canShowEmailError) {
        Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
        Intrinsics.checkNotNullParameter(optionalFieldInputs, "optionalFieldInputs");
        Intrinsics.checkNotNullParameter(contactEmailContext, "contactEmailContext");
        return new ContactEmailDataState(isSending, emailInput, descriptionInput, optionalFieldInputs, contactEmailContext, canShowEmailError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactEmailDataState)) {
            return false;
        }
        ContactEmailDataState contactEmailDataState = (ContactEmailDataState) other;
        return this.isSending == contactEmailDataState.isSending && Intrinsics.areEqual(this.emailInput, contactEmailDataState.emailInput) && Intrinsics.areEqual(this.descriptionInput, contactEmailDataState.descriptionInput) && Intrinsics.areEqual(this.optionalFieldInputs, contactEmailDataState.optionalFieldInputs) && Intrinsics.areEqual(this.contactEmailContext, contactEmailDataState.contactEmailContext) && this.canShowEmailError == contactEmailDataState.canShowEmailError;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSending) * 31;
        String str = this.emailInput;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.descriptionInput.hashCode()) * 31) + this.optionalFieldInputs.hashCode()) * 31) + this.contactEmailContext.hashCode()) * 31) + Boolean.hashCode(this.canShowEmailError);
    }

    public String toString() {
        return "ContactEmailDataState(isSending=" + this.isSending + ", emailInput=" + this.emailInput + ", descriptionInput=" + this.descriptionInput + ", optionalFieldInputs=" + this.optionalFieldInputs + ", contactEmailContext=" + this.contactEmailContext + ", canShowEmailError=" + this.canShowEmailError + ")";
    }

    public ContactEmailDataState(boolean z, String str, String descriptionInput, Map<String, String> optionalFieldInputs, ContactEmailContext contactEmailContext, boolean z2) {
        Intrinsics.checkNotNullParameter(descriptionInput, "descriptionInput");
        Intrinsics.checkNotNullParameter(optionalFieldInputs, "optionalFieldInputs");
        Intrinsics.checkNotNullParameter(contactEmailContext, "contactEmailContext");
        this.isSending = z;
        this.emailInput = str;
        this.descriptionInput = descriptionInput;
        this.optionalFieldInputs = optionalFieldInputs;
        this.contactEmailContext = contactEmailContext;
        this.canShowEmailError = z2;
    }

    public final boolean isSending() {
        return this.isSending;
    }

    public final String getEmailInput() {
        return this.emailInput;
    }

    public /* synthetic */ ContactEmailDataState(boolean z, String str, String str2, Map map, ContactEmailContext contactEmailContext, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? MapsKt.emptyMap() : map, contactEmailContext, (i & 32) != 0 ? false : z2);
    }

    public final String getDescriptionInput() {
        return this.descriptionInput;
    }

    public final Map<String, String> getOptionalFieldInputs() {
        return this.optionalFieldInputs;
    }

    public final ContactEmailContext getContactEmailContext() {
        return this.contactEmailContext;
    }

    public final boolean getCanShowEmailError() {
        return this.canShowEmailError;
    }
}
