package androidx.test.espresso.idling;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.test.espresso.IdlingResource;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class CountingIdlingResource implements IdlingResource {
    private static final String TAG = "CountingIdlingResource";
    private volatile long becameBusyAt;
    private volatile long becameIdleAt;
    private final AtomicInteger counter;
    private final boolean debugCounting;
    private volatile IdlingResource.ResourceCallback resourceCallback;
    private final String resourceName;

    @Override // androidx.test.espresso.IdlingResource
    public void registerIdleTransitionCallback(IdlingResource.ResourceCallback resourceCallback) {
    }

    public CountingIdlingResource(String resourceName) {
        this(resourceName, false);
    }

    public CountingIdlingResource(String resourceName, boolean debugCounting) {
        this.counter = new AtomicInteger(0);
        this.becameBusyAt = 0L;
        this.becameIdleAt = 0L;
        if (TextUtils.isEmpty(resourceName)) {
            throw new IllegalArgumentException("resourceName cannot be empty or null!");
        }
        this.resourceName = resourceName;
        this.debugCounting = debugCounting;
    }

    @Override // androidx.test.espresso.IdlingResource
    public String getName() {
        return this.resourceName;
    }

    @Override // androidx.test.espresso.IdlingResource
    public boolean isIdleNow() {
        return this.counter.get() == 0;
    }

    public void increment() {
        int andIncrement = this.counter.getAndIncrement();
        if (andIncrement == 0) {
            this.becameBusyAt = SystemClock.uptimeMillis();
        }
        if (this.debugCounting) {
            Log.i(TAG, "Resource: " + this.resourceName + " in-use-count incremented to: " + (andIncrement + 1));
        }
    }

    public void decrement() {
        int iDecrementAndGet = this.counter.decrementAndGet();
        if (iDecrementAndGet == 0) {
            this.becameIdleAt = SystemClock.uptimeMillis();
        }
        if (this.debugCounting) {
            if (iDecrementAndGet == 0) {
                Log.i(TAG, "Resource: " + this.resourceName + " went idle! (Time spent not idle: " + (this.becameIdleAt - this.becameBusyAt) + ")");
            } else {
                Log.i(TAG, "Resource: " + this.resourceName + " in-use-count decremented to: " + iDecrementAndGet);
            }
        }
        if (iDecrementAndGet > -1) {
            return;
        }
        throw new IllegalStateException("Counter has been corrupted! counterVal=" + iDecrementAndGet);
    }

    public void dumpStateToLogs() {
        StringBuilder sb = new StringBuilder("Resource: ");
        sb.append(this.resourceName);
        sb.append(" inflight transaction count: ");
        sb.append(this.counter.get());
        if (0 == this.becameBusyAt) {
            sb.append(" and has never been busy!");
            Log.i(TAG, sb.toString());
            return;
        }
        sb.append(" and was last busy at: ");
        sb.append(this.becameBusyAt);
        if (0 == this.becameIdleAt) {
            sb.append(" AND NEVER WENT IDLE!");
            Log.w(TAG, sb.toString());
        } else {
            sb.append(" and last went idle at: ");
            sb.append(this.becameIdleAt);
            Log.i(TAG, sb.toString());
        }
    }
}
