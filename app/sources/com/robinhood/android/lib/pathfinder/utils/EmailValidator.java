package com.robinhood.android.lib.pathfinder.utils;

import android.util.Patterns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailValidator.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/utils/EmailValidator;", "", "<init>", "()V", "validate", "", "email", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class EmailValidator {
    public static final int $stable = 0;

    public final boolean validate(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
