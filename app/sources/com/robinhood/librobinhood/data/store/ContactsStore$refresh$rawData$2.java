package com.robinhood.librobinhood.data.store;

import android.database.Cursor;
import com.robinhood.models.contacts.ReferralContactData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ContactsStore$refresh$rawData$2 extends FunctionReferenceImpl implements Function1<Cursor, ReferralContactData.Raw> {
    public static final ContactsStore$refresh$rawData$2 INSTANCE = new ContactsStore$refresh$rawData$2();

    ContactsStore$refresh$rawData$2() {
        super(1, ReferralContactData.Raw.class, "<init>", "<init>(Landroid/database/Cursor;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReferralContactData.Raw invoke(Cursor p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReferralContactData.Raw(p0);
    }
}
