package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import com.plaid.internal.EnumC7081g;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class MotionKeyTrigger extends MotionKey {
    FloatRect mCollisionRect;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private String mNegativeCross;
    private String mPositiveCross;
    private boolean mPostLayout;
    FloatRect mTargetRect;
    private int mTriggerCollisionId;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;
    private int mCurveFit = -1;
    private String mCross = null;

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }

    public void conditionallyFire(float f, MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public MotionKeyTrigger() {
        int i = MotionKey.UNSET;
        this.mTriggerReceiver = i;
        this.mNegativeCross = null;
        this.mPositiveCross = null;
        this.mTriggerID = i;
        this.mTriggerCollisionId = i;
        this.mTriggerSlack = 0.1f;
        this.mFireCrossReset = true;
        this.mFireNegativeReset = true;
        this.mFirePositiveReset = true;
        this.mFireThreshold = Float.NaN;
        this.mPostLayout = false;
        this.mViewTransitionOnNegativeCross = i;
        this.mViewTransitionOnPositiveCross = i;
        this.mViewTransitionOnCross = i;
        this.mCollisionRect = new FloatRect();
        this.mTargetRect = new FloatRect();
        this.mType = 5;
        this.mCustom = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getId(String str) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE;
            case "viewTransitionOnPositiveCross":
                return 302;
            case "triggerCollisionId":
                return EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE;
            case "triggerID":
                return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE;
            case "negativeCross":
                return EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE;
            case "triggerCollisionView":
                return EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE;
            case "viewTransitionOnNegativeCross":
                return EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE;
            case "triggerSlack":
                return EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE;
            case "viewTransitionOnCross":
                return EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE;
            case "postLayout":
                return EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE;
            case "triggerReceiver":
                return EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTrigger copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTrigger motionKeyTrigger = (MotionKeyTrigger) motionKey;
        this.mCurveFit = motionKeyTrigger.mCurveFit;
        this.mCross = motionKeyTrigger.mCross;
        this.mTriggerReceiver = motionKeyTrigger.mTriggerReceiver;
        this.mNegativeCross = motionKeyTrigger.mNegativeCross;
        this.mPositiveCross = motionKeyTrigger.mPositiveCross;
        this.mTriggerID = motionKeyTrigger.mTriggerID;
        this.mTriggerCollisionId = motionKeyTrigger.mTriggerCollisionId;
        this.mTriggerSlack = motionKeyTrigger.mTriggerSlack;
        this.mFireCrossReset = motionKeyTrigger.mFireCrossReset;
        this.mFireNegativeReset = motionKeyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = motionKeyTrigger.mFirePositiveReset;
        this.mFireThreshold = motionKeyTrigger.mFireThreshold;
        this.mFireLastPos = motionKeyTrigger.mFireLastPos;
        this.mPostLayout = motionKeyTrigger.mPostLayout;
        this.mCollisionRect = motionKeyTrigger.mCollisionRect;
        this.mTargetRect = motionKeyTrigger.mTargetRect;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo8186clone() {
        return new MotionKeyTrigger().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, int i2) {
        if (i == 307) {
            this.mTriggerCollisionId = i2;
            return true;
        }
        if (i == 308) {
            this.mTriggerID = toInt(Integer.valueOf(i2));
            return true;
        }
        if (i == 311) {
            this.mTriggerReceiver = i2;
            return true;
        }
        switch (i) {
            case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                this.mViewTransitionOnCross = i2;
                return true;
            case 302:
                this.mViewTransitionOnPositiveCross = i2;
                return true;
            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                this.mViewTransitionOnNegativeCross = i2;
                return true;
            default:
                return super.setValue(i, i2);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, float f) {
        if (i == 305) {
            this.mTriggerSlack = f;
            return true;
        }
        return super.setValue(i, f);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, String str) {
        if (i == 309) {
            this.mPositiveCross = str;
            return true;
        }
        if (i == 310) {
            this.mNegativeCross = str;
            return true;
        }
        if (i == 312) {
            this.mCross = str;
            return true;
        }
        return super.setValue(i, str);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i, boolean z) {
        if (i == 304) {
            this.mPostLayout = z;
            return true;
        }
        return super.setValue(i, z);
    }
}
