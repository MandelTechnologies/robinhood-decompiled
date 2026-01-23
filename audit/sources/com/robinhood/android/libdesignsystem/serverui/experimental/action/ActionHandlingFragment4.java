package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [ActionT] */
/* compiled from: ActionHandlingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragmentKt$ContentWithDialog$2$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class ActionHandlingFragment4<ActionT> extends FunctionReferenceImpl implements Function1<ActionT, Boolean> {
    ActionHandlingFragment4(Object obj) {
        super(1, obj, ActionHandlingFragment.class, "handle", "handle(Ljava/lang/Object;)Z", 0);
    }

    /* JADX WARN: Incorrect types in method signature: (TActionT;)Ljava/lang/Boolean; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Parcelable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((ActionHandlingFragment) this.receiver).mo15941handle(p0));
    }
}
