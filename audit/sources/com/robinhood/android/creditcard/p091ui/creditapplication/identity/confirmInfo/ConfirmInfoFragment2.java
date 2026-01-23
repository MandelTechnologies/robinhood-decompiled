package com.robinhood.android.creditcard.p091ui.creditapplication.identity.confirmInfo;

import com.robinhood.android.creditcard.p091ui.creditapplication.identity.IdentityDuxo3;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.PersonalInfo;
import com.robinhood.android.models.creditcard.api.graphql.IdentityDetailsPrefillResponse2;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: ConfirmInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toPersonalInfo", "Lcom/robinhood/android/creditcard/ui/creditapplication/identity/PersonalInfo;", "Lcom/robinhood/android/models/creditcard/api/graphql/IdentityDetailsPrefillObject;", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.identity.confirmInfo.ConfirmInfoFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ConfirmInfoFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalInfo toPersonalInfo(IdentityDetailsPrefillResponse2 identityDetailsPrefillResponse2) throws IOException {
        return new PersonalInfo(identityDetailsPrefillResponse2.getFirstName(), identityDetailsPrefillResponse2.getLastName(), identityDetailsPrefillResponse2.getEmail(), IdentityDuxo3.strippedPhone(identityDetailsPrefillResponse2.getE164()), identityDetailsPrefillResponse2.getDateOfBirth(), identityDetailsPrefillResponse2.getSsnLast4());
    }
}
