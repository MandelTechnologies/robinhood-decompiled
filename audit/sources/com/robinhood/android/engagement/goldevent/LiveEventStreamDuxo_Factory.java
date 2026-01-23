package com.robinhood.android.engagement.goldevent;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LiveEventStreamDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "appContext", "Landroid/content/Context;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-live-event-stream_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class LiveEventStreamDuxo_Factory implements Factory<LiveEventStreamDuxo> {
    private final Provider<Context> appContext;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<CoroutineScope> rootCoroutineScope;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LiveEventStreamDuxo_Factory create(Provider<DuxoBundle> provider, Provider<Context> provider2, Provider<SavedStateHandle> provider3, Provider<MicrogramManager> provider4, Provider<LazyMoshi> provider5, Provider<CoroutineScope> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final LiveEventStreamDuxo newInstance(DuxoBundle duxoBundle, Context context, SavedStateHandle savedStateHandle, MicrogramManager microgramManager, LazyMoshi lazyMoshi, CoroutineScope coroutineScope) {
        return INSTANCE.newInstance(duxoBundle, context, savedStateHandle, microgramManager, lazyMoshi, coroutineScope);
    }

    public LiveEventStreamDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<Context> appContext, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramManager> microgramManager, Provider<LazyMoshi> moshi, Provider<CoroutineScope> rootCoroutineScope) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
        this.duxoBundle = duxoBundle;
        this.appContext = appContext;
        this.savedStateHandle = savedStateHandle;
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.rootCoroutineScope = rootCoroutineScope;
    }

    @Override // javax.inject.Provider
    public LiveEventStreamDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        Context context = this.appContext.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        CoroutineScope coroutineScope = this.rootCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        return companion.newInstance(duxoBundle, context, savedStateHandle, microgramManager, lazyMoshi, coroutineScope);
    }

    /* compiled from: LiveEventStreamDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "appContext", "Landroid/content/Context;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rootCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "newInstance", "Lcom/robinhood/android/engagement/goldevent/LiveEventStreamDuxo;", "feature-live-event-stream_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LiveEventStreamDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<Context> appContext, Provider<SavedStateHandle> savedStateHandle, Provider<MicrogramManager> microgramManager, Provider<LazyMoshi> moshi, Provider<CoroutineScope> rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new LiveEventStreamDuxo_Factory(duxoBundle, appContext, savedStateHandle, microgramManager, moshi, rootCoroutineScope);
        }

        @JvmStatic
        public final LiveEventStreamDuxo newInstance(DuxoBundle duxoBundle, Context appContext, SavedStateHandle savedStateHandle, MicrogramManager microgramManager, LazyMoshi moshi, CoroutineScope rootCoroutineScope) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(rootCoroutineScope, "rootCoroutineScope");
            return new LiveEventStreamDuxo(duxoBundle, appContext, savedStateHandle, microgramManager, moshi, rootCoroutineScope);
        }
    }
}
