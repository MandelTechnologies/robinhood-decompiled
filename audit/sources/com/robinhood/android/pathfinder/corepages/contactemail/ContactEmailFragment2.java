package com.robinhood.android.pathfinder.corepages.contactemail;

import com.robinhood.models.api.pathfinder.input.OptionalField;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactEmailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.contactemail.ContactEmailFragment$ComposeContent$1$4$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ContactEmailFragment2 extends FunctionReferenceImpl implements Function3<String, String, List<? extends OptionalField>, Unit> {
    ContactEmailFragment2(Object obj) {
        super(3, obj, ContactEmailDuxo.class, "sendEmail", "sendEmail(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, List<? extends OptionalField> list) {
        invoke2(str, str2, (List<OptionalField>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String p1, List<OptionalField> p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((ContactEmailDuxo) this.receiver).sendEmail(str, p1, p2);
    }
}
