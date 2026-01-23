package com.robinhood.android.pathfinder.corepages.contactemail;

import com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.pathfinder.contexts.ContactEmailContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ContactEmailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailDataState;", "Lcom/robinhood/android/pathfinder/corepages/contactemail/ContactEmailViewState;", "<init>", "()V", "reduce", "dataState", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ContactEmailStateProvider implements StateProvider<ContactEmailDataState, ContactEmailViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public ContactEmailViewState reduce(ContactEmailDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ContactEmailContext contactEmailContext = dataState.getContactEmailContext();
        String descriptionInput = dataState.getDescriptionInput();
        String emailInput = dataState.getEmailInput();
        if (emailInput == null) {
            emailInput = contactEmailContext.getEmail();
        }
        String str = emailInput;
        if (contactEmailContext.getNeedsEmail()) {
            boolean z = true;
            boolean zIsSending = dataState.isSending();
            ImmutableMap immutableMap = extensions2.toImmutableMap(dataState.getOptionalFieldInputs());
            String callToAction = contactEmailContext.getCallToAction();
            if (str == null || StringsKt.isBlank(str) || StringsKt.isBlank(descriptionInput)) {
                z = false;
            }
            boolean z2 = z;
            ImmutableList immutableList = extensions2.toImmutableList(contactEmailContext.getOptionalFieldDescriptions());
            RichText emailErrorMessage = contactEmailContext.getEmailErrorMessage();
            if (!dataState.getCanShowEmailError()) {
                emailErrorMessage = null;
            }
            return new ContactEmailViewState.EmailRequired(zIsSending, descriptionInput, immutableMap, callToAction, z2, immutableList, str, emailErrorMessage);
        }
        return new ContactEmailViewState.EmailNotRequired(dataState.isSending(), descriptionInput, extensions2.toImmutableMap(dataState.getOptionalFieldInputs()), contactEmailContext.getCallToAction(), !StringsKt.isBlank(descriptionInput), extensions2.toImmutableList(contactEmailContext.getOptionalFieldDescriptions()));
    }
}
