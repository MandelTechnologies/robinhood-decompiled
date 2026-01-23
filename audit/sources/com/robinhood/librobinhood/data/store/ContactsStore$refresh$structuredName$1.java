package com.robinhood.librobinhood.data.store;

import android.content.ContentResolver;
import android.database.Cursor;
import com.robinhood.models.contacts.ReferralContactData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ContactsStore$refresh$structuredName$1 extends FunctionReferenceImpl implements Function1<ContentResolver, Cursor> {
    ContactsStore$refresh$structuredName$1(Object obj) {
        super(1, obj, ReferralContactData.StructuredName.Companion.class, "query", "query(Landroid/content/ContentResolver;)Landroid/database/Cursor;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Cursor invoke(ContentResolver p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((ReferralContactData.StructuredName.Companion) this.receiver).query(p0);
    }
}
