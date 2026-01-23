package kotlin.reflect.jvm.internal.impl.platform;

/* compiled from: TargetPlatform.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.platform.SimplePlatform, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class TargetPlatform2 {
    private final String platformName;
    private final TargetPlatform3 targetPlatformVersion;

    public String toString() {
        String targetName = getTargetName();
        if (targetName.length() <= 0) {
            return this.platformName;
        }
        return this.platformName + " (" + targetName + ')';
    }

    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public TargetPlatform3 getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }
}
