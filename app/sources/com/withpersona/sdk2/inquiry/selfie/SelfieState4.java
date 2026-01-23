package com.withpersona.sdk2.inquiry.selfie;

import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelfieState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"deleteAllSelfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "selfie_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieStateKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SelfieState4 {
    public static final void deleteAllSelfies(SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(selfieState, "<this>");
        Iterator<T> it = selfieState.getSelfies$selfie_release().iterator();
        while (it.hasNext()) {
            new File(((Selfie) it.next()).getAbsoluteFilePath()).delete();
        }
    }
}
