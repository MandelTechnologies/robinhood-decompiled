package com.robinhood.android.optionsexercise;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OptionEventStore;
import com.robinhood.librobinhood.data.store.OptionExerciseStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionExerciseManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionExerciseManager_Factory implements Factory<OptionExerciseManager> {
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<OptionEventStore> optionEventStore;
    private final Provider<OptionExerciseStore> optionExerciseStore;
    private final Provider<RxFactory> rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionExerciseManager_Factory create(Provider<CoroutineScope> provider, Provider<OptionEventStore> provider2, Provider<OptionExerciseStore> provider3, Provider<RxFactory> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OptionExerciseManager newInstance(CoroutineScope coroutineScope, OptionEventStore optionEventStore, OptionExerciseStore optionExerciseStore, RxFactory rxFactory) {
        return INSTANCE.newInstance(coroutineScope, optionEventStore, optionExerciseStore, rxFactory);
    }

    public OptionExerciseManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<OptionEventStore> optionEventStore, Provider<OptionExerciseStore> optionExerciseStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
        Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.coroutineScope = coroutineScope;
        this.optionEventStore = optionEventStore;
        this.optionExerciseStore = optionExerciseStore;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public OptionExerciseManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        OptionEventStore optionEventStore = this.optionEventStore.get();
        Intrinsics.checkNotNullExpressionValue(optionEventStore, "get(...)");
        OptionExerciseStore optionExerciseStore = this.optionExerciseStore.get();
        Intrinsics.checkNotNullExpressionValue(optionExerciseStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(coroutineScope, optionEventStore, optionExerciseStore, rxFactory);
    }

    /* compiled from: OptionExerciseManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionsexercise/OptionExerciseManager_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "optionEventStore", "Lcom/robinhood/librobinhood/data/store/OptionEventStore;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionExerciseManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<OptionEventStore> optionEventStore, Provider<OptionExerciseStore> optionExerciseStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
            Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new OptionExerciseManager_Factory(coroutineScope, optionEventStore, optionExerciseStore, rxFactory);
        }

        @JvmStatic
        public final OptionExerciseManager newInstance(CoroutineScope coroutineScope, OptionEventStore optionEventStore, OptionExerciseStore optionExerciseStore, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(optionEventStore, "optionEventStore");
            Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new OptionExerciseManager(coroutineScope, optionEventStore, optionExerciseStore, rxFactory);
        }
    }
}
