package com.stripe.android.analytics;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.stripe.android.analytics.Session;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import java.io.Closeable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionSavedStateHandler.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/analytics/SessionSavedStateHandler;", "", "<init>", "()V", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "", "startSession", "(Landroidx/lifecycle/SavedStateHandle;)V", "restartSession", "clearSession", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Function0;", "attachTo", "(Landroidx/lifecycle/ViewModel;Landroidx/lifecycle/SavedStateHandle;)Lkotlin/jvm/functions/Function0;", "", "sessionLocked", "Z", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SessionSavedStateHandler {
    private static boolean sessionLocked;
    public static final SessionSavedStateHandler INSTANCE = new SessionSavedStateHandler();
    public static final int $stable = 8;

    private SessionSavedStateHandler() {
    }

    public final Function0<Unit> attachTo(ViewModel viewModel, final SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        startSession(savedStateHandle);
        viewModel.addCloseable(new Closeable() { // from class: com.stripe.android.analytics.SessionSavedStateHandler$$ExternalSyntheticLambda0
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                SessionSavedStateHandler.attachTo$lambda$0(savedStateHandle);
            }
        });
        return new Function0<Unit>() { // from class: com.stripe.android.analytics.SessionSavedStateHandler.attachTo.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SessionSavedStateHandler.INSTANCE.restartSession(savedStateHandle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachTo$lambda$0(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "$savedStateHandle");
        INSTANCE.clearSession(savedStateHandle);
    }

    private final void startSession(SavedStateHandle savedStateHandle) {
        Parcelable owner;
        Session session = (Session) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (session != null) {
            if (session instanceof Session.Owner) {
                AnalyticsRequestFactory.Companion companion = AnalyticsRequestFactory.INSTANCE;
                UUID uuidFromString = UUID.fromString(((Session.Owner) session).getId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                companion.setSessionId(uuidFromString);
                sessionLocked = true;
                return;
            }
            return;
        }
        if (!sessionLocked) {
            sessionLocked = true;
            UUID uuidRandomUUID = UUID.randomUUID();
            AnalyticsRequestFactory.Companion companion2 = AnalyticsRequestFactory.INSTANCE;
            Intrinsics.checkNotNull(uuidRandomUUID);
            companion2.setSessionId(uuidRandomUUID);
            String string2 = uuidRandomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            owner = new Session.Owner(string2);
        } else {
            owner = Session.Observer.INSTANCE;
        }
        savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", owner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartSession(SavedStateHandle savedStateHandle) {
        Session session = (Session) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (session == null || !(session instanceof Session.Owner)) {
            return;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AnalyticsRequestFactory.Companion companion = AnalyticsRequestFactory.INSTANCE;
        Intrinsics.checkNotNull(uuidRandomUUID);
        companion.setSessionId(uuidRandomUUID);
        String string2 = uuidRandomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        savedStateHandle.set("STRIPE_ANALYTICS_LOCAL_SESSION", new Session.Owner(string2));
    }

    private final void clearSession(SavedStateHandle savedStateHandle) {
        Session session = (Session) savedStateHandle.get("STRIPE_ANALYTICS_LOCAL_SESSION");
        if (session == null || !(session instanceof Session.Owner)) {
            return;
        }
        sessionLocked = false;
    }
}
