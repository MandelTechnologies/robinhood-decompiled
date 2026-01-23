package com.robinhood.android.search.newsfeed.view.util;

import android.util.Pair;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.PlaybackException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DummyErrorMessageProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/util/DummyErrorMessageProvider;", "Landroidx/media3/common/ErrorMessageProvider;", "Landroidx/media3/common/PlaybackException;", "<init>", "()V", "getErrorMessage", "Landroid/util/Pair;", "", "", "throwable", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DummyErrorMessageProvider implements ErrorMessageProvider<PlaybackException> {
    public static final int $stable = 0;

    @Override // androidx.media3.common.ErrorMessageProvider
    public Pair<Integer, String> getErrorMessage(PlaybackException throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new Pair<>(0, "");
    }
}
