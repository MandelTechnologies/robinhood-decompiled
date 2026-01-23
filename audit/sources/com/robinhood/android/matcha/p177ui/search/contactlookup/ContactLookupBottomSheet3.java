package com.robinhood.android.matcha.p177ui.search.contactlookup;

import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupViewState;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContactLookupBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toLogAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$Action;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupBottomSheetKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ContactLookupBottomSheet3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData.Action toLogAction(ContactLookupViewState.Action action) {
        if (action instanceof ContactLookupViewState.Action.Cancel) {
            return UserInteractionEventData.Action.CANCEL;
        }
        if (action instanceof ContactLookupViewState.Action.ContinueToPay) {
            return UserInteractionEventData.Action.CONTINUE;
        }
        if (action instanceof ContactLookupViewState.Action.PayByEmail) {
            return UserInteractionEventData.Action.PAY_BY_EMAIL;
        }
        if (action instanceof ContactLookupViewState.Action.PayByText) {
            return UserInteractionEventData.Action.PAY_BY_PHONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
