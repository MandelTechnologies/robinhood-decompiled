package microgram.android.haptic;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.robinhood.microgram.haptic.HapticManager;
import com.robinhood.microgram.haptic.HapticType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealMicrogramHapticManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/haptic/RealMicrogramHapticManager;", "Lcom/robinhood/microgram/haptic/MicrogramHapticManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "perform", "", "haptic", "Lcom/robinhood/microgram/haptic/HapticType;", "(Lcom/robinhood/microgram/haptic/HapticType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class RealMicrogramHapticManager implements HapticManager {
    private final Context context;

    /* compiled from: RealMicrogramHapticManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HapticType.values().length];
            try {
                iArr[HapticType.NOTIFICATION_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HapticType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealMicrogramHapticManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.robinhood.microgram.haptic.HapticManager
    public Object perform(HapticType hapticType, Continuation<? super Unit> continuation) {
        if (Build.VERSION.SDK_INT >= 29) {
            Vibrator vibrator = (Vibrator) this.context.getSystemService(Vibrator.class);
            int i = WhenMappings.$EnumSwitchMapping$0[hapticType.ordinal()];
            if (i == 1) {
                vibrator.vibrate(VibrationEffect.createPredefined(0));
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
