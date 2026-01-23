package com.robinhood.android.pathfinder.corepages.contactchannel;

import com.robinhood.models.p355ui.pathfinder.contexts.ContactChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactChannelDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelDataState;", "", "isSendingUserInput", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/ContactChannelContext;", "<init>", "(ZLcom/robinhood/models/ui/pathfinder/contexts/ContactChannelContext;)V", "()Z", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/ContactChannelContext;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContactChannelDataState {
    public static final int $stable = 8;
    private final ContactChannelContext context;
    private final boolean isSendingUserInput;

    public static /* synthetic */ ContactChannelDataState copy$default(ContactChannelDataState contactChannelDataState, boolean z, ContactChannelContext contactChannelContext, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contactChannelDataState.isSendingUserInput;
        }
        if ((i & 2) != 0) {
            contactChannelContext = contactChannelDataState.context;
        }
        return contactChannelDataState.copy(z, contactChannelContext);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSendingUserInput() {
        return this.isSendingUserInput;
    }

    /* renamed from: component2, reason: from getter */
    public final ContactChannelContext getContext() {
        return this.context;
    }

    public final ContactChannelDataState copy(boolean isSendingUserInput, ContactChannelContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ContactChannelDataState(isSendingUserInput, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactChannelDataState)) {
            return false;
        }
        ContactChannelDataState contactChannelDataState = (ContactChannelDataState) other;
        return this.isSendingUserInput == contactChannelDataState.isSendingUserInput && Intrinsics.areEqual(this.context, contactChannelDataState.context);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isSendingUserInput) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "ContactChannelDataState(isSendingUserInput=" + this.isSendingUserInput + ", context=" + this.context + ")";
    }

    public ContactChannelDataState(boolean z, ContactChannelContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSendingUserInput = z;
        this.context = context;
    }

    public /* synthetic */ ContactChannelDataState(boolean z, ContactChannelContext contactChannelContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, contactChannelContext);
    }

    public final boolean isSendingUserInput() {
        return this.isSendingUserInput;
    }

    public final ContactChannelContext getContext() {
        return this.context;
    }
}
