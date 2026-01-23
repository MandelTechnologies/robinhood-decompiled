package androidx.test.espresso;

/* loaded from: classes4.dex */
public interface IdlingResource {

    public interface ResourceCallback {
    }

    String getName();

    boolean isIdleNow();

    void registerIdleTransitionCallback(ResourceCallback callback);
}
