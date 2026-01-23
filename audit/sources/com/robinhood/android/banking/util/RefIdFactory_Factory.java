package com.robinhood.android.banking.util;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RefIdFactory_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/banking/util/RefIdFactory_Factory;", "TRANSFERDATA", "Ldagger/internal/Factory;", "Lcom/robinhood/android/banking/util/RefIdFactory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RefIdFactory_Factory<TRANSFERDATA> implements Factory<RefIdFactory<TRANSFERDATA>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SavedStateHandle> savedStateHandle;

    @JvmStatic
    public static final <TRANSFERDATA> RefIdFactory_Factory<TRANSFERDATA> create(Provider<SavedStateHandle> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final <TRANSFERDATA> RefIdFactory<TRANSFERDATA> newInstance(SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(savedStateHandle);
    }

    public RefIdFactory_Factory(Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public RefIdFactory<TRANSFERDATA> get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(savedStateHandle);
    }

    /* compiled from: RefIdFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/banking/util/RefIdFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/banking/util/RefIdFactory_Factory;", "TRANSFERDATA", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/banking/util/RefIdFactory;", "feature-lib-banking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <TRANSFERDATA> RefIdFactory_Factory<TRANSFERDATA> create(Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RefIdFactory_Factory<>(savedStateHandle);
        }

        @JvmStatic
        public final <TRANSFERDATA> RefIdFactory<TRANSFERDATA> newInstance(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new RefIdFactory<>(savedStateHandle);
        }
    }
}
