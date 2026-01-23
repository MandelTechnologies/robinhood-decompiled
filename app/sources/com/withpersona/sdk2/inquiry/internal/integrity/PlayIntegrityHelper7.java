package com.withpersona.sdk2.inquiry.internal.integrity;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayIntegrityHelper.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelperKt$sam$com_google_android_gms_tasks_OnSuccessListener$0, reason: use source file name */
/* loaded from: classes18.dex */
final /* synthetic */ class PlayIntegrityHelper7 implements OnSuccessListener {
    private final /* synthetic */ Function1 function;

    PlayIntegrityHelper7(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.function.invoke(obj);
    }
}
