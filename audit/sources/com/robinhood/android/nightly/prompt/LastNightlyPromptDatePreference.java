package com.robinhood.android.nightly.prompt;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringPreference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDateTime;

/* compiled from: LastNightlyPromptDatePreference.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "", "Landroid/content/SharedPreferences;", "preferences", "", "key", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "j$/time/LocalDateTime", "getLastPromptDate", "()Lj$/time/LocalDateTime;", "", "setPromptedToday", "()V", "setNeverPromptAgainDate", "Lcom/robinhood/prefs/StringPreference;", "backingPreference", "Lcom/robinhood/prefs/StringPreference;", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LastNightlyPromptDatePreference {
    public static final int $stable = 8;
    private final StringPreference backingPreference;

    public LastNightlyPromptDatePreference(SharedPreferences preferences, String key) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        this.backingPreference = new StringPreference(preferences, key, null, null, 12, null);
    }

    public final LocalDateTime getLastPromptDate() {
        Object objM28550constructorimpl;
        String str = this.backingPreference.get();
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(LocalDateTime.parse(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return (LocalDateTime) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }

    public final void setPromptedToday() {
        this.backingPreference.set(LocalDateTime.now().toString());
    }

    public final void setNeverPromptAgainDate() {
        this.backingPreference.set(LocalDateTime.now().plusMonths(6L).toString());
    }
}
