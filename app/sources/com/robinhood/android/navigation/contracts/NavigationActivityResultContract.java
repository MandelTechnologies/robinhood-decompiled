package com.robinhood.android.navigation.contracts;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationActivityResultContract.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0005:\u0001\u0016B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract;", "K", "Lcom/robinhood/android/navigation/keys/IntentKey;", "R", "Landroid/os/Parcelable;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "navigatorDelegate", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Landroid/os/Parcelable;", "NavigationParams", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class NavigationActivityResultContract<K extends IntentKey, R extends Parcelable> extends ActivityResultContract<NavigationParams<K>, R> {
    public static final int $stable = 8;
    private final Function0<Navigator> navigatorDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationActivityResultContract(Function0<? extends Navigator> navigatorDelegate) {
        Intrinsics.checkNotNullParameter(navigatorDelegate, "navigatorDelegate");
        this.navigatorDelegate = navigatorDelegate;
    }

    /* compiled from: NavigationActivityResultContract.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Key", "Lcom/robinhood/android/navigation/keys/IntentKey;", "", "key", "performanceMetricSource", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "shouldClearTop", "", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Z)V", "getKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getPerformanceMetricSource", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "getShouldClearTop", "()Z", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/navigation/keys/IntentKey;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Z)Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "equals", "other", "hashCode", "", "toString", "", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigationParams<Key extends IntentKey> {
        public static final int $stable = 0;
        private final Key key;
        private final PerformanceMetricEventData.Source performanceMetricSource;
        private final boolean shouldClearTop;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NavigationParams copy$default(NavigationParams navigationParams, IntentKey intentKey, PerformanceMetricEventData.Source source, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = navigationParams.key;
            }
            if ((i & 2) != 0) {
                source = navigationParams.performanceMetricSource;
            }
            if ((i & 4) != 0) {
                z = navigationParams.shouldClearTop;
            }
            return navigationParams.copy(intentKey, source, z);
        }

        public final Key component1() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final PerformanceMetricEventData.Source getPerformanceMetricSource() {
            return this.performanceMetricSource;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldClearTop() {
            return this.shouldClearTop;
        }

        public final NavigationParams<Key> copy(Key key, PerformanceMetricEventData.Source performanceMetricSource, boolean shouldClearTop) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new NavigationParams<>(key, performanceMetricSource, shouldClearTop);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationParams)) {
                return false;
            }
            NavigationParams navigationParams = (NavigationParams) other;
            return Intrinsics.areEqual(this.key, navigationParams.key) && this.performanceMetricSource == navigationParams.performanceMetricSource && this.shouldClearTop == navigationParams.shouldClearTop;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            PerformanceMetricEventData.Source source = this.performanceMetricSource;
            return ((iHashCode + (source == null ? 0 : source.hashCode())) * 31) + Boolean.hashCode(this.shouldClearTop);
        }

        public String toString() {
            return "NavigationParams(key=" + this.key + ", performanceMetricSource=" + this.performanceMetricSource + ", shouldClearTop=" + this.shouldClearTop + ")";
        }

        public NavigationParams(Key key, PerformanceMetricEventData.Source source, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.performanceMetricSource = source;
            this.shouldClearTop = z;
        }

        public /* synthetic */ NavigationParams(IntentKey intentKey, PerformanceMetricEventData.Source source, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(intentKey, (i & 2) != 0 ? null : source, (i & 4) != 0 ? false : z);
        }

        public final Key getKey() {
            return this.key;
        }

        public final PerformanceMetricEventData.Source getPerformanceMetricSource() {
            return this.performanceMetricSource;
        }

        public final boolean getShouldClearTop() {
            return this.shouldClearTop;
        }
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public Intent createIntent(Context context, NavigationParams<K> input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return this.navigatorDelegate.invoke().createIntent(context, input.getKey(), input.getPerformanceMetricSource(), input.getShouldClearTop());
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    public R parseResult(int resultCode, Intent intent) {
        if (intent != null) {
            return (R) NavigationActivityResultContract3.result(intent);
        }
        return null;
    }
}
